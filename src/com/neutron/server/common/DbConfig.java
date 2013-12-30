package com.neutron.server.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neutron.server.persistence.iface.T_userMapper;
import com.neutron.server.persistence.model.T_user;

public class DbConfig {

	/**
	 * @param args
	 * @return
	 */

	public static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getSqlSessionFactroy(){
		if(sqlSessionFactory!=null) return sqlSessionFactory; 
		String resource = "com/neutron/server/persistence/mybatis-config.xml";
		try {
			InputStream inputStream;
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
//	private static void dbTest() {
//		try {
//			
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = (Connection) DriverManager.
//				getConnection(Util.getProper("datebase.properties").getProperty("url"),
//						Util.getProper("datebase.properties").getProperty("username"),
//						Util.getProper("datebase.properties").getProperty("password"));
//			
//			String sql = "select count(*)  from neutron.T_USER";
//			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				System.out.println(rs.getString("count(*)"));
//			}
//
//			ps.close();
//			rs.close();
//			conn.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
//		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\com\\neutron\\server\\log4j.xml");
//		Logger log=Logger.getLogger(DbConfig.class);
//        log.info("测试");
        
		
//		System.exit(0);
		
//		 dbTest();
		 
		 getSqlSessionFactroy();
		 
		 SqlSession session = sqlSessionFactory.openSession();
		 
		 try {
//			 User user = (User) session.selectOne("com.neutron.server.persistence.model.UserMapper.selectUserByID", 1);
//		        System.out.println(user.getUserAddress());
//		        System.out.println(user.getUserName());
		        
//		        IUserOperation userOperation=session.getMapper(IUserOperation.class);
//	            User user = userOperation.selectUserByID(1);
//	            System.out.println(user.getUserAddress());
//		        System.out.println(user.getUserName());
//		        
//		        
//				T_system sys = (T_system) session.selectOne("com.neutron.server.persistence.model.T_systemMapper.selectByID", 1);
//			        System.out.println(sys.getT_SYSTEM_name());
//			        System.out.println(sys.getT_SYSTEM_value());
			        
			 
			    T_userMapper ui = session.getMapper(T_userMapper.class);
		        T_user tu = ui.selectByPrimaryKey(1);
		        System.out.println(tu.gettUserName());
			    System.out.println(tu.gettUserBirth());
			        
		        } finally {
		        session.close();
		 }
		 
	}

}
