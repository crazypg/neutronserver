import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.neutron.server.persistence.model.T_user;


public class test {

	@SuppressWarnings("unchecked")
	private static void testCommunicate(){
		try {
		URL postUrl;
//		postUrl = new URL("http://localhost:8080/NeutronServer/passcode");
		postUrl = new URL("http://219.141.181.131:12581/NeutronServer/passcode");
		
		
		HttpURLConnection urlConn = (HttpURLConnection) postUrl.openConnection();  
		
		urlConn.setDoOutput(true);  
	    urlConn.setDoInput(true);  
	    urlConn.setUseCaches(false);  
	    urlConn.setRequestProperty("Content-type","application/x-java-serialized-object");  
	    urlConn.setRequestMethod("POST");  
	    urlConn.connect();  
	    
	    OutputStream outStrm = urlConn.getOutputStream();  
	    ObjectOutputStream oos = new ObjectOutputStream(outStrm);  

	    T_user user = new T_user();  
//	    user.settUserRegtag(0);
//	    user.settUserName("李靖");
	    
//	    user.settUserId(1);
//	    user.settUserPasscode("123456");
	    user.settUserPhonenumber("18910011001");;
	    user.settUserAreacode("+86");;
	    
		ArrayList<Serializable> paraList = new ArrayList<Serializable>();
	    paraList.add("getpasscode");
	    paraList.add(user);
	    
	    oos.writeObject(paraList);  
	    oos.flush();  
	    oos.close();  

	    //接收
	    InputStream inStrm = urlConn.getInputStream(); 
	    ObjectInputStream ois = new ObjectInputStream(inStrm);  
	    paraList = (ArrayList<Serializable>)ois.readObject();
	    String isSucceed = (String)paraList.get(0);
//	    int returnValue = (Integer)paraList.get(1);
	    
	    //only for query
	    user = (T_user)paraList.get(1);
	    
	    System.out.println(user.gettUserName());
	    System.out.println("isSucceed="+isSucceed);
//	    System.out.println("isSucceed="+isSucceed+";returnValue="+returnValue);
	    
	    System.out.println(user.gettUserPasscode());
//	    System.out.println(user.gettUserPasscodeTimestamp());
	    
	    //only for query
//	    System.out.println("isSucceed="+isSucceed);
//	    System.out.println(user==null?"没有这个用户":user.gettUserName());
		    
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
		testCommunicate();
		
//		System.out.println(Util.getProper("sys_config.properties").getProperty("foo"));
		
//		Date date = new Date();
//		System.out.println(date);
//		System.out.println(new java.sql.Timestamp(date.getTime()));
		
	}

}
