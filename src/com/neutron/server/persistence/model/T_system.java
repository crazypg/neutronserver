package com.neutron.server.persistence.model;

import java.io.Serializable;

public class T_system implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2815584199502414331L;
	private int T_SYSTEM_id;
	private String T_SYSTEM_name;
	private String T_SYSTEM_value;
	
	public int getT_SYSTEM_id() {
		return T_SYSTEM_id;
	}
	public void setT_SYSTEM_id(int t_SYSTEM_id) {
		T_SYSTEM_id = t_SYSTEM_id;
	}
	public String getT_SYSTEM_name() {
		return T_SYSTEM_name;
	}
	public void setT_SYSTEM_name(String t_SYSTEM_name) {
		T_SYSTEM_name = t_SYSTEM_name;
	}
	public String getT_SYSTEM_value() {
		return T_SYSTEM_value;
	}
	public void setT_SYSTEM_value(String t_SYSTEM_value) {
		T_SYSTEM_value = t_SYSTEM_value;
	}
	
	
}
