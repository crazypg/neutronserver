package com.neutron.server.common;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

public class Util {
	
	private static Properties props;
	private static Properties sysprops;
	private static String innerPath= "WEB-INF"+System.getProperty("file.separator")
		+"classes"+System.getProperty("file.separator")
		+"com"+System.getProperty("file.separator")
		+"neutron"+System.getProperty("file.separator")
		+"server"+System.getProperty("file.separator")
		+"common"+System.getProperty("file.separator")
		+"sys_config.properties";
	
	public static Properties getProper(String cfgPath) {
		try {
			if(props==null){
				props = new Properties();
			}
			FileInputStream fis = new FileInputStream(cfgPath+System.getProperty("file.separator")+"sys_config.properties");
			props.load(fis);
			return props;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Properties getSysProper(String path) {
		try {
			if(sysprops==null){
				sysprops = new Properties();
			}
			FileInputStream fis = new FileInputStream(path+innerPath);
			sysprops.load(fis);
			return sysprops;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//generate a random n bit number
	public static String genPasscode(int n){
		Random r = new Random();
		String val = "";
		
		for(int i=0;i<n;i++){
			val += r.nextInt(10);
		}
		return val;
	}
	
}
