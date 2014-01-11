import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.neutron.server.persistence.model.T_accdata;
import com.neutron.server.persistence.model.T_rmr;
import com.neutron.server.persistence.model.T_user;

public class test {

	@SuppressWarnings("unchecked")
	private static void testCommunicate(String host,String servName,String method){
		try {
		URL postUrl=null;
		
		if(host.equals("local")){
			postUrl = new URL("http://localhost:8080/NeutronServer/"+servName);
		}else if(host.equals("172")){
			postUrl = new URL("http://172.20.8.183:12581/NeutronServer/"+servName);
		}else if(host.equals("219")){
			postUrl = new URL("http://219.141.181.131:12581/NeutronServer/"+servName);
		}else{
			System.exit(0);
		}
		
		HttpURLConnection urlConn = (HttpURLConnection) postUrl.openConnection();  
		
		urlConn.setDoOutput(true);  
	    urlConn.setDoInput(true);  
	    urlConn.setUseCaches(false);  
	    urlConn.setRequestProperty("Content-type","application/octet-stream");//x-java-serialized-object");  
	    urlConn.setRequestMethod("POST");  
	    urlConn.connect();  
	    
	    OutputStream outStrm = urlConn.getOutputStream();  
	    ObjectOutputStream oos = new ObjectOutputStream(outStrm);  

	    T_user user = new T_user();  
	    ArrayList<Serializable> paraList = new ArrayList<Serializable>();
	    
	    /////////////////////input//////////////////////////////////////////////////////////
	    if(servName.equals("login")){
	    	if(method.equals("add")){
	    		paraList.add(method);
	    		user.settUserName("武瞾");
	    		user.settUserRegtag(0);
	    		
	    		FileInputStream fis = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\images.jpg")); 
	    		int filelong = fis.available(); 
	    		byte[] long_buf = new byte[filelong]; 
	    		fis.read(long_buf); 	    		
	    		fis.close();
	    		user.settUserPicture(long_buf);
	    		user.settUserAvatar("jpg");
	    		
	    		paraList.add(user);
	    		
	    	}else if(method.equals("query")){ 
	    		
	    		paraList.add(method);
	    		user.settUserId(21);
	    		paraList.add(user);
	    		
	    	}else if(method.equals("saveavatar")){
	    		
	    		FileInputStream fis = new FileInputStream(new File("C:\\Users\\crazypg\\Desktop\\ava.jpg")); 
	    		int filelong = fis.available(); 
	    		byte[] long_buf = new byte[filelong]; 
	    		fis.read(long_buf); 
	    		fis.close();
	    		
	    		paraList.add(method);
	    		user.settUserId(1);
	    		paraList.add(user);
	    		paraList.add(long_buf);
	    		paraList.add("jpg");
	    		
	    	}else if(method.equals("delavatar")){
	    		
	    		paraList.add(method);
	    		user.settUserId(1);
	    		paraList.add(user);
	    		
	    	}else if(method.equals("getavatar")){
	    		
	    		paraList.add(method);
	    		user.settUserId(1);
	    		paraList.add(user);
	    	}else{
	    		System.out.println(servName+"没有这种方法");
	    		System.exit(0);
	    	}
	    	
	    }else if(servName.equals("passcode")){
	    	
	    	if(method.equals("isvalid")){
	    		
	    		user.settUserId(1);
	    		user.settUserPasscode("123456");
	    		
	    	    paraList.add(method);
	    	    paraList.add(user);
	    	    
	    	}else if(method.equals("getpasscode")){
	    		
//	    		user.settUserId(8);
	    		user.settUserAreacode("+86");
	    		user.settUserPhonenumber("11011001100");
	    		paraList.add(method);
		    	paraList.add(user);
		    	
	    	}else if(method.equals("login")){
	    		
	    	}else{
	    		System.out.println(servName+"没有这种方法");
	    		System.exit(0);
	    	}
	    }else if(servName.equals("data")){
	    	if(method.equals("upload")){
	    		T_accdata ad = new T_accdata();
	    		ArrayList<T_accdata> uploadList = new ArrayList<T_accdata>();
	    		
	    		ad.settAccdataUserid(1);ad.settAccdataValue(1.01);ad.settAccdataDatatime(new Date());uploadList.add(ad);
	    		ad = new T_accdata();ad.settAccdataUserid(1);ad.settAccdataValue(1.02);ad.settAccdataDatatime(new Date());uploadList.add(ad);
	    		ad = new T_accdata();ad.settAccdataUserid(1);ad.settAccdataValue(1.03);ad.settAccdataDatatime(new Date());uploadList.add(ad);
	    		ad = new T_accdata();ad.settAccdataUserid(1);ad.settAccdataValue(1.04);ad.settAccdataDatatime(new Date());uploadList.add(ad);
	    		ad = new T_accdata();ad.settAccdataUserid(1);ad.settAccdataValue(1.05);ad.settAccdataDatatime(new Date());uploadList.add(ad);
	    		
	    		paraList.add(method);
	    		paraList.add(uploadList);
	    	}else if(method.equals("getrmrbynum")){
	    		paraList.add(method);
	    		paraList.add(18);
	    		paraList.add(20);
	    	}else if(method.equals("getrmrbytime")){
	    		paraList.add(method);
	    		paraList.add(18);
	    		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    		try {
					paraList.add(fmt.parse("2014-01-08 21:30:00"));
					paraList.add(fmt.parse("2014-01-09 21:30:20"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
	    	}
	    }else{
	    	System.out.println("没有这种servlet");
	    	System.exit(0);
	    }
	    
	    oos.writeObject(paraList);  
	    oos.flush();  
	    oos.close();  

	    //接收
	    InputStream inStrm = urlConn.getInputStream(); 
	    ObjectInputStream ois = new ObjectInputStream(inStrm);  
	    paraList = (ArrayList<Serializable>)ois.readObject();
	    String isSucceed = "";
		int returnValue = -1;
	    
	    System.out.println("=========="+host+"上的运行结果==========");
	    ////////////////////////output///////////////////////////////////////////////
	    if(servName.equals("login")){
	    	
	    	if(method.equals("add")){
	    		
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		returnValue = (Integer)paraList.get(1);	 
	    		System.out.println("returnValue="+returnValue);
	    		
	    	}else if(method.equals("query")){
	    		
	    		user = (T_user)paraList.get(1);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    	    System.out.println(user==null?"没有这个用户":user.gettUserName());
	    	    
	    	    byte[] get_buf = (byte[])user.gettUserPicture();
	    	    File file = new File("C:\\Users\\admin\\Desktop\\loginQuery."+user.gettUserAvatar());
	    	    FileOutputStream foStream = new FileOutputStream(file);
	    	    foStream.write(get_buf);
	    	    foStream.close();	  
	    	    
	    	}else if(method.equals("saveavatar")){
	    		
	    		System.out.println(paraList.size());
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    	}else if(method.equals("delavatar")){
	    		
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    	}else if(method.equals("getavatar")){
	    		
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    		byte[] get_buf = (byte[])paraList.get(1);
	    		System.out.println("文件大小："+get_buf.length+";文件类型："+(String)paraList.get(2));
	    	}
	    	
	    }else if(servName.equals("passcode")){
	    	
	    	if(method.equals("isvalid")){
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    	}else if(method.equals("getpasscode")){
	    		
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    		user = (T_user)paraList.get(1);
	    		
	    		byte[] get_buf = (byte[])user.gettUserPicture();
	    		
	    		System.out.println(user.gettUserImei()+user.gettUserImsi()+user.gettUserName()+get_buf.length);
	    		
	    	    File file = new File("C:\\Users\\admin\\Desktop\\getpasscode."+user.gettUserAvatar());
	    	    FileOutputStream foStream = new FileOutputStream(file);
	    	    foStream.write(get_buf);
	    	    foStream.close();	 
	    		
	    	}
	    }else if(servName.equals("data")){
	    	if(method.equals("upload")){
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    	}else if(method.equals("getrmrbynum")){
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    		ArrayList<T_rmr> rmrList = (ArrayList<T_rmr>) paraList.get(1);
	    		for(Iterator<T_rmr> iterator = rmrList.iterator();iterator.hasNext();){
	    			System.out.println(iterator.next().gettRmrDatetime());
	    		}
	    	}else if(method.equals("getrmrbytime")){
	    		isSucceed = (String)paraList.get(0);
	    		System.out.println(servName+"/"+method+"的执行结果：");
	    		System.out.println("isSucceed="+isSucceed);
	    		
	    		ArrayList<T_rmr> rmrList = (ArrayList<T_rmr>) paraList.get(1);
	    		for(Iterator<T_rmr> iterator = rmrList.iterator();iterator.hasNext();){
	    			System.out.println(iterator.next().gettRmrDatetime());
	    		}
	    	}
	    }
	    
	    ois.close();
	    urlConn.disconnect();
	    
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {

		testCommunicate("219","data","getrmrbytime");
		
//		CalModel cmCalModel = new CalModel();
//		cmCalModel.processRmrIndex();
//		cmCalModel.processRmr();
		
	}

}
