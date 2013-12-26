package com.neutron.server.login;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.neutron.server.common.DbConfig;
import com.neutron.server.persistence.iface.T_userMapper;
import com.neutron.server.persistence.model.T_user;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getParameter("param"));
//		response.getOutputStream().println("OK");
		
		response.setContentType("text/html;charset=UTF-8"); 
		response.getWriter().println("doGet");
		
		SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
		
		try{
			 T_userMapper ui = session.getMapper(T_userMapper.class);
		     T_user tu = ui.selectByPrimaryKey(1);
		     response.getWriter().println(tu.gettUserName());
		     response.getWriter().println(tu.gettUserBirth());
		     tu = ui.selectByPrimaryKey(2);
		     response.getWriter().println(tu.gettUserName());
		     response.getWriter().println(tu.gettUserBirth());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
	        session.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("doPost");  

		response.setContentType("text/html;charset=UTF-8"); 
		ArrayList<Serializable> paraList = new ArrayList<Serializable>();
          
        try{  
            InputStream in = request.getInputStream();  
            ObjectInputStream ois = new ObjectInputStream(in);
            paraList = (ArrayList<Serializable>)(ois.readObject());  
            String methodString = (String)paraList.get(0);
            T_user user = (T_user)paraList.get(1);  
          //置空，作返回值用
            paraList.clear();;
            
//            测试用
           /* System.out.println(methodString); 
            System.out.println(user.gettUserName());  
            user.settUserPhonenumber("13610100101");*/
//          response.getWriter().println(user.gettUserName());
//          response.getOutputStream().print("back");
            
            int returnValue = -1;
            //申请sqlSession
            SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
            T_userMapper ui = session.getMapper(T_userMapper.class);
            //根据method参数进行操作
            if(methodString==null){
            	paraList.add("error");
            }else if(methodString.equals("add")){
            	paraList.add("ok");
            	returnValue = ui.insert(user);
            	paraList.add(returnValue);
            }else if(methodString.equals("delete")){
            	paraList.add("ok");
            	//先通过主键查出该条记录
            	user = ui.selectByPrimaryKey(user.gettUserId());
            	user.settUserDeltag("1");
            	returnValue = ui.updateByPrimaryKey(user);
            	paraList.add(returnValue);
            }else if(methodString.equals("update")){
            	paraList.add("ok");
            	//先通过主键查出该条记录
            	returnValue = ui.updateByPrimaryKey(user);
            	paraList.add(returnValue);
            }else if(methodString.equals("query")){
            	paraList.add("ok");
            	user = ui.selectByPrimaryKey(user.gettUserId());
            	paraList.add(user);
            }else{
            	paraList.add("error");
            }
            session.commit();
            //关闭sqlSession
            session.close();
            
            //返回值
            new ObjectOutputStream(response.getOutputStream()).writeObject(paraList);
            

        }catch(Exception e){
        	e.printStackTrace();
        }
    }  

}
