package com.neutron.server.sns;

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
import com.neutron.server.persistence.iface.T_relationMapper;
import com.neutron.server.persistence.model.T_relation;
import com.neutron.server.persistence.model.T_relationExample;

/**
 * Servlet implementation class Relation
 */
@WebServlet("/Relation")
public class Relation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Relation() {
        super();
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
            T_relationExample relationExample = new T_relationExample();
            
            T_relation relation = null;
            
            if(methodString==null){
            	
            }else if(methodString.equals("queryWithCriteria")){
            	relationExample = (T_relationExample) paraList.get(1);
            }else{
            	relation = (T_relation)paraList.get(1);
            }
            
        	
          //置空，作返回值用
            paraList.clear();
            
            int returnValue = -1;
            //申请sqlSession
            SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
            T_relationMapper relationMapper = session.getMapper(T_relationMapper.class);
            //根据method参数进行操作
            if(methodString==null){
            	paraList.add("error");
            }else if(methodString.equals("add")){
            	paraList.add("ok");
            	returnValue = relationMapper.insert(relation);
            	paraList.add(relationMapper.getLastInsertID());//取得刚插入的ID
            }else if(methodString.equals("delete")){
            	//先通过主键查出该条记录
            	relationExample.createCriteria().andTRelationMasterIdEqualTo(relation.gettRelationMasterId()).
            		andTRelationSalveIdEqualTo(relation.gettRelationSalveId());
            	ArrayList<T_relation> relations = 
            			(ArrayList<T_relation>) relationMapper.selectByExample(relationExample);
            	
            	if(relations!=null){
            		if(relations.size() == 1){
            			paraList.add("delOk");
            			relation = relations.get(0);
            			relation.settRelationDeltag("1");
                    	returnValue = relationMapper.updateByPrimaryKey(relation);
                    	paraList.add(returnValue);
            		}else{
            			paraList.add("moreThanOneToDelete");
            		}
            	}else{
            		paraList.add("error");
            	}
            	
            }else if(methodString.equals("update")){
            	paraList.add("ok");
            	//先通过主键查出该条记录
            	returnValue = relationMapper.updateByPrimaryKey(relation);
            	paraList.add(returnValue);
            }else if(methodString.equals("queryWithCriteria")){
            	paraList.add("ok");
            	ArrayList<T_relation> relations = (ArrayList<T_relation>) relationMapper.selectByExample(relationExample);
            	paraList.add(relations);
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
