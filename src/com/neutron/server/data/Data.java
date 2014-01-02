package com.neutron.server.data;

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

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;

import com.neutron.server.common.DbConfig;
import com.neutron.server.persistence.iface.T_accdataMapper;
import com.neutron.server.persistence.model.T_accdata;

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
            ArrayList<T_accdata> uploadList = (ArrayList<T_accdata>)paraList.get(1);  
            
            //置空，作返回值用
            paraList.clear();
            
            //申请sqlSession
            //批量执行
            SqlSession session = DbConfig.getSqlSessionFactroy().openSession(ExecutorType.BATCH, true);
            T_accdataMapper mapper = session.getMapper(T_accdataMapper.class);
            
            if(methodString == null || uploadList == null){
            	paraList.add("error");
            }else if(methodString.equals("") || uploadList.size()==0){
            	paraList.add("error");
            }else if(methodString.equals("upload")){
            	mapper.insertBatch(uploadList);
            	paraList.add("ok");
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
