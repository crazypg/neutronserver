package com.neutron.server.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.neutron.server.common.DbConfig;
import com.neutron.server.persistence.iface.T_userMapper;
import com.neutron.server.persistence.model.T_user;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("param"));
//		response.getOutputStream().println("OK");
		response.setContentType("text/html;charset=UTF-8"); 
		response.getWriter().println("不接受get方式提交");
		
		SqlSession session = DbConfig.getSqlSessionFactroy().openSession();
		try{
			 T_userMapper ui = session.getMapper(T_userMapper.class);
		     T_user tu = ui.selectByPrimaryKey(1);
		     response.getWriter().println(tu.gettUserName());
		     response.getWriter().println(tu.gettUserBirth());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
		
	}

}
