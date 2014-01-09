package com.neutron.server.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import com.neutron.server.common.Util;
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
		response.getWriter().println("<br/>");
		response.getWriter().println("doGet::Only For TEST perpose");
		response.getWriter().println("<br/>");
		response.getWriter().println(System.getProperty("os.name"));
		response.getWriter().println("<br/>");
		response.getWriter().println(Util.getSysProper(getServletContext().getRealPath(System.getProperty("file.separator")))
	            		.getProperty("passcodetimeout"));
		
		SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
		
		try{
			 T_userMapper ui = session.getMapper(T_userMapper.class);
		     T_user tu = ui.selectByPrimaryKey(1);
		     response.getWriter().println("<br/>");
		     response.getWriter().println(tu.gettUserName());
		     response.getWriter().println("<br/>");
		     response.getWriter().println(tu.gettUserBirth());
		     tu = ui.selectByPrimaryKey(2);
		     response.getWriter().println("<br/>");
		     response.getWriter().println(tu.gettUserName());
		     response.getWriter().println("<br/>");
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
		response.setContentType("text/html;charset=UTF-8"); 
		ArrayList<Serializable> paraList = new ArrayList<Serializable>();
          
        try{  
            InputStream in = request.getInputStream();  
            ObjectInputStream ois = new ObjectInputStream(in);
            paraList = (ArrayList<Serializable>)(ois.readObject());  
            String methodString = (String)paraList.get(0);
            
            T_user user = (T_user)paraList.get(1);
            
            String pathname = "";
            byte[] long_buf = null;
        	FileOutputStream fos=null; //for receive file
        	String picTypeString = "";
        	
            if(methodString!=null && methodString.equals("saveavatar")){
            	long_buf = (byte[])paraList.get(2);
            	picTypeString = (String)paraList.get(3);
            }
            
        	
          //置空，作返回值用
            paraList.clear();
            
            int returnValue = -1;
            //申请sqlSession
            SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
            T_userMapper ui = session.getMapper(T_userMapper.class);
            //根据method参数进行操作
            if(methodString==null){
            	paraList.add("error");
            }else if(methodString.equals("add")){
            	paraList.add("ok");
            	if(user.gettUserPicture()!=null && user.gettUserPicture().length/1024 > Long.valueOf(Util.getSysProper(getServletContext().
						getRealPath(System.getProperty("file.separator"))).getProperty("avatar.size"))){
        			paraList.add("picTooLarge");
        		}else{
                	returnValue = ui.insert(user);
                	paraList.add(ui.getLastInsertID());//取得刚插入的user的ID
        		}
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
            }else if(methodString.equals("updateWithBlob")){
            	paraList.add("ok");
            	//先通过主键查出该条记录
            	returnValue = ui.updateByPrimaryKeyWithBLOBs(user);
            	paraList.add(returnValue);
            }else if(methodString.equals("query")){
            	paraList.add("ok");
            	user = ui.selectByPrimaryKey(user.gettUserId());
            	paraList.add(user);
            }else if(methodString.equals("saveavatar")){
            	if(System.getProperty("os.name").toLowerCase().contains("windows")){
	            	pathname = Util.getSysProper(getServletContext().getRealPath(System.getProperty("file.separator")))
		            		.getProperty("windows.rootpicpath")
		            		+System.getProperty("file.separator")+user.gettUserId()+System.getProperty("file.separator");
            	}else{
            		pathname = Util.getSysProper(getServletContext().getRealPath(System.getProperty("file.separator")))
		            		.getProperty("linux.rootpicpath")
		            		+System.getProperty("file.separator")+user.gettUserId()+System.getProperty("file.separator");
            	}
            	
            	String randomFileNameString = Util.genPasscode(10);
            	user.settUserAvatar(pathname+randomFileNameString+"."+picTypeString);
            	if(ui.updateByPrimaryKey(user)==0){
            		paraList.add("noUser");
            	}else{
            		session.commit();
            		
            		File pathnameFile = new File(pathname);//保存在指定路径
            		pathnameFile.mkdirs();
            		
            		if(long_buf.length/1024 > Long.valueOf(Util.getSysProper(getServletContext().
							getRealPath(System.getProperty("file.separator"))).getProperty("avatar.size"))){
            			paraList.add("picTooLarge");
            		}else{
						paraList.add("saveOk");
	                    fos=new FileOutputStream(pathname+randomFileNameString+"."+picTypeString,true);   
	                    fos.write(long_buf);   
	                    fos.flush(); 
	                    fos.close();
            		}
            	}
            }else if(methodString.equals("getavatar")){
            	pathname = ui.selectByPrimaryKey(user.gettUserId()).gettUserAvatar();
            	File getFile = new File(pathname);
            	if(getFile.exists()){
            		paraList.add("ok");
            		
    	    		FileInputStream fis = new FileInputStream(new File(pathname)); 
    	    		int filelong = fis.available(); 
    	    		byte[] get_buf = new byte[filelong]; 
    	    		fis.read(get_buf); 
    	    		fis.close();
    	    		
            		paraList.add(get_buf);
            	}else{
            		paraList.add("error");
            	}
            }else if(methodString.equals("delavatar")){
            	pathname = ui.selectByPrimaryKey(user.gettUserId()).gettUserAvatar();
            	user.settUserAvatar("");//删除
            	if(ui.updateByPrimaryKey(user)==0){
            		paraList.add("noUser");
            	}else{
            		session.commit();
            		File delFile = new File(pathname);
            		delFile.delete();
            		paraList.add("delOk");
            	}
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
