package com.neutron.server.common;

import java.io.FileInputStream;
import java.util.Properties;

public class Util {

	private static Properties props;
	
	public static Properties getProper() {
		try {
			if(props==null){
				props = new Properties();
			}
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\properties\\database.properties");
			props.load(fis);
			return props;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
