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
import com.neutron.server.common.Util;
import com.neutron.server.persistence.iface.T_userMapper;
import com.neutron.server.persistence.model.T_user;
import com.neutron.server.persistence.model.T_userExample;

/**
 * Servlet implementation class GetPasscode
 */
@WebServlet("/GetPasscode")
public class Passcode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Passcode() {
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
            
            //申请sqlSession
            SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
            T_userMapper ui = session.getMapper(T_userMapper.class);
            
            //根据method参数进行操作
            if(methodString==null){
            	paraList.add("error");
            }else if(methodString.equals("isvalid")){
            	String inPasscodeString = user.gettUserPasscode();
            	user = ui.selectByPrimaryKey(user.gettUserId());
            	if(user == null || user.gettUserPasscode() == null || inPasscodeString == null){
            		paraList.add("novalid");
            	}else 
//            		if(((new Timestamp(new Date().getTime()).getTime() - user.gettUserPasscodeTimestamp().getTime())/1000/60) >= 
//	            Integer.valueOf(com.neutron.server.common.Util.getSysProper(getServletContext().getRealPath(System.getProperty("file.separator")))
//	            		.getProperty("passcodetimeout"))){
//            		paraList.add("novalid");
//            	}else 
            		if(user.gettUserPasscode().equals(inPasscodeString)){
            		paraList.add("valid");
            	}else {
            		paraList.add("novalid");
            	}
            }else if(methodString.equals("getpasscode")){
            	T_userExample tExample = new T_userExample();
            	tExample.createCriteria().andTUserAreacodeEqualTo(user.gettUserAreacode())
            		.andTUserPhonenumberEqualTo(user.gettUserPhonenumber());
            	java.util.List<T_user> resultList = ui.selectByExampleWithBLOBs(tExample);
            	
            	if(resultList==null){
            		paraList.add("error");
            	}else if(resultList.size()==0){//新用户
            		paraList.add("new");
            		user.settUserPasscode(Util.genPasscode(6));
            		paraList.add(user); 
            	}else if(resultList.size()==1){//注册用户
            		paraList.add("registered");
            		user = resultList.get(0);
            		user.settUserPasscode(Util.genPasscode(6));
            		paraList.add(user); 
            	}else if(resultList.size()>1){
            		paraList.add("moreThanOneResult");
            	}
            }else if(methodString.equals("login")){
            	if(user.gettUserPhonenumber()== null || user.gettUserAreacode() == null || user.gettUserPasscode() == null){
            		paraList.add("para Error");
            	}else if(user.gettUserPhonenumber().equals("") || user.gettUserAreacode().equals("") || user.gettUserPasscode().equals("")){
            		paraList.add("para Error");
            	}else{
                	T_userExample tExample = new T_userExample();
                	tExample.createCriteria().andTUserAreacodeEqualTo(user.gettUserAreacode())
                		.andTUserPhonenumberEqualTo(user.gettUserPhonenumber());
                	java.util.List<T_user> resultList = ui.selectByExample(tExample);
                	
                	if(resultList==null){
                		paraList.add("noResult");
                	}else if(resultList.size()==0){
                		paraList.add("noResult");
                	}else if(resultList.size()==1){
                		paraList.add("ok");
                		String passcode = user.gettUserPasscode();
                		user = resultList.get(0);
                		user.settUserPasscode(passcode);
                		user.settUserPasscodeTimestamp(ts);
                		ui.updateByPrimaryKey(user);
                		paraList.add(user);
                	}else if(resultList.size()>1){
                		paraList.add("moreThanOneResult");
                	}
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
