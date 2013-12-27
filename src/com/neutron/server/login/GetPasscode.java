package com.neutron.server.login;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

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
 * Servlet implementation class GetPasscode
 */
@WebServlet("/GetPasscode")
public class GetPasscode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPasscode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
		ArrayList<Serializable> paraList = new ArrayList<Serializable>();
          
        try{  
            InputStream in = request.getInputStream();  
            ObjectInputStream ois = new ObjectInputStream(in);
            paraList = (ArrayList<Serializable>)(ois.readObject());  
            String methodString = (String)paraList.get(0);
            T_user user = (T_user)paraList.get(1);  
            
            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());
            
          //置空，作返回值用
            paraList.clear();;
            
//            int returnValue = -1;
            //申请sqlSession
            SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
            T_userMapper ui = session.getMapper(T_userMapper.class);
            //根据method参数进行操作
            if(methodString==null){
            	paraList.add("error");
            }else if(methodString.equals("getpasscode")){
            	paraList.add("ok");
            	user = ui.selectByPrimaryKey(user.gettUserId());
            	
	            //may be use for first time
	            if(user.gettUserPasscodeTimestamp() == null){
	            	user.settUserPasscodeTimestamp(ts);
	            	ui.updateByPrimaryKey(user);
	            }
	            	
	//System.out.println(this.getClass().getClassLoader().getResource("/").getPath() );            	
	            	
	            if(((new Timestamp(new Date().getTime()).getTime() - user.gettUserPasscodeTimestamp().getTime())/1000/60) > 60){
	        		user.settUserPasscodeTimestamp(ts);
	        		ui.updateByPrimaryKey(user);
	            }        	

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
