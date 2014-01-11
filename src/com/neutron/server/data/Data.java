package com.neutron.server.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;

import com.neutron.server.common.DbConfig;
import com.neutron.server.persistence.iface.T_accdataMapper;
import com.neutron.server.persistence.iface.T_rmrMapper;
import com.neutron.server.persistence.model.T_accdata;
import com.neutron.server.persistence.model.T_rmr;
import com.neutron.server.persistence.model.T_rmrExample;

/**
 * Servlet implementation class Data
 */
@WebServlet("/Data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Data() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	}

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
            ArrayList<T_accdata> uploadList = null;
            int userid = -1;
            int num = -1;
            Date data1 = null;
            Date data2 = null;
            
            
            if(methodString == null){
            	
            }else if(methodString.equals("upload")){
            	uploadList = (ArrayList<T_accdata>)paraList.get(1);
            }else if(methodString.equals("getrmrbynum")){
            	userid = (Integer) paraList.get(1);
            	num = (Integer) paraList.get(2);
            }else if(methodString.equals("getrmrbytime")){
            	userid = (Integer) paraList.get(1);
            	data1 = (Date) paraList.get(2);
            	data2 = (Date) paraList.get(3);
            }
            
            //置空，作返回值用
            paraList.clear();
            
            //申请sqlSession
            //批量执行
            SqlSession sessionBatch = DbConfig.getSqlSessionFactroy().openSession(ExecutorType.BATCH, true);
            T_accdataMapper mapper = sessionBatch.getMapper(T_accdataMapper.class);
            T_rmrMapper rmrMapper = sessionBatch.getMapper(T_rmrMapper.class);
            T_rmrExample rmrExample = new T_rmrExample();
            
            if(methodString == null){
            	paraList.add("error");
            }else if(methodString.equals("")){
            	paraList.add("error");
            }else if(uploadList!=null && uploadList.size()>0 && methodString.equals("upload")){
            	mapper.insertBatch(uploadList);
            	paraList.add("ok");
            }else if(methodString.equals("getrmrbynum")){
            	if(userid ==-1 || num ==-1){
            		paraList.add("input error");
            	}else{
	            	rmrExample.createCriteria().andTRmrUseridEqualTo(userid);
	            	rmrExample.setOrderByClause(" t_rmr_datetime desc ");
	            	rmrExample.setlimitClause(num);
	            	
	            	ArrayList<T_rmr> rmrList = (ArrayList<T_rmr>) rmrMapper.selectByExample(rmrExample);
	            	
	            	paraList.add("ok");
	            	paraList.add(rmrList);
            	}
            }else if(methodString.equals("getrmrbytime")){
            	if(userid ==-1 || data1==null || data2 ==null){
            		paraList.add("input error");
            	}else{
            		rmrExample.createCriteria().andTRmrUseridEqualTo(userid).andTRmrDatetimeBetween(data1, data2);
            		
            		ArrayList<T_rmr> rmrList = (ArrayList<T_rmr>) rmrMapper.selectByExample(rmrExample);
	            	
	            	paraList.add("ok");
	            	paraList.add(rmrList);
            	}
            }else{
            	paraList.add("error");
            }
            
            sessionBatch.commit();
            //关闭sqlSession
            sessionBatch.close();
            //返回值
            new ObjectOutputStream(response.getOutputStream()).writeObject(paraList);
        }catch(Exception e){
        	e.printStackTrace();
        }
        
	}

}
