package com.neutron.server.common;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;

import com.neutron.server.persistence.iface.T_accdataMapper;
import com.neutron.server.persistence.iface.T_rmrMapper;
import com.neutron.server.persistence.iface.T_rmr_indexMapper;
import com.neutron.server.persistence.iface.T_userMapper;
import com.neutron.server.persistence.model.T_accdata;
import com.neutron.server.persistence.model.T_accdataExample;
import com.neutron.server.persistence.model.T_rmr;
import com.neutron.server.persistence.model.T_rmr_index;
import com.neutron.server.persistence.model.T_rmr_indexExample;

public class CalModel {

	static SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
	static SqlSession batchSession = DbConfig.getSqlSessionFactroy().openSession(ExecutorType.BATCH, true);
	static T_userMapper userMapper = session.getMapper(T_userMapper.class);
	static T_accdataMapper accdataMapper = session.getMapper(T_accdataMapper.class);
	static T_rmrMapper rmrMapper = batchSession.getMapper(T_rmrMapper.class);
	static T_rmr_indexMapper rmrIndexMapper = batchSession.getMapper(T_rmr_indexMapper.class);
	
	//temprary 
	T_rmr_index rmrIndex = new T_rmr_index();
	T_rmr rmr = new T_rmr();
	int userid = -1;
	
	private double calRmrIndex(int userid){
		
		//TODO fill true
		return Double.valueOf(userid%10 + "." + Util.genPasscode(2));
		
	}
	
	//TODO redesign this by new table !!!
	private double calRmr(int userid){
		
		return Double.valueOf(userid%10 + "." + Util.genPasscode(2));
				
	}
	
	//TODO 是否添加根据用户分组
	public void processRmrIndex(){
		//get all T_accdata data
		ArrayList<T_accdata> accDataList = (ArrayList<T_accdata>) accdataMapper.selectByExample(new T_accdataExample());
		ArrayList<Integer> userIDs = new ArrayList<Integer>();
		
		//distinct users
		for(Iterator<T_accdata> itr = accDataList.iterator(); itr.hasNext();){
			userid = (Integer) itr.next().gettAccdataUserid();
			if(!userIDs.contains(userid)) userIDs.add(userid);
		}
		
		if(userIDs.size()==0) return;
		
		for(Iterator<Integer> itr = userIDs.iterator(); itr.hasNext();){
			userid = itr.next();
			rmrIndex.settRmrIndexUserid(userid);
			rmrIndex.settRmrIndexValue(calRmrIndex(userid));
			rmrIndex.settRmrIndexDatetime(Calendar.getInstance().getTime());
			rmrIndexMapper.insert(rmrIndex);
		}
		
		batchSession.commit();
	}
	
	public void processRmr(){
		ArrayList<T_rmr_index> rmr_indexList = (ArrayList<T_rmr_index>) rmrIndexMapper.selectByExample(new T_rmr_indexExample());
		ArrayList<Integer> userIDs = new ArrayList<Integer>();
		
		//distinct users
		for(Iterator<T_rmr_index> itr = rmr_indexList.iterator(); itr.hasNext();){
			userid = (Integer) itr.next().gettRmrIndexUserid();
			if(!userIDs.contains(userid)) userIDs.add(userid);
		}
		
		if(userIDs.size()==0) return;
		
		for(Iterator<Integer> itr = userIDs.iterator(); itr.hasNext();){
			userid = itr.next();
			rmr.settRmrUserid(userid);
			rmr.settRmrValue(calRmr(userid));
			rmr.settRmrDatetime(Calendar.getInstance().getTime());
			rmrMapper.insert(rmr);
		}
		
		batchSession.commit();
	}
	
}
