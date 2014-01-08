package com.neutron.server.common;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;

/**
 * Application Lifecycle Listener implementation class CronListener
 *
 */
@WebListener
public class CronListener extends HttpServlet implements ServletContextListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4851350575234782738L;

	/**
     * Default constructor. 
     */
    public CronListener() {
        // TODO Auto-generated constructor stub
    }

    private Timer timer = null;
    
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	 timer = new Timer(true);
    	 arg0.getServletContext().log("自动查询用户表监听器已启动");
         timer.schedule(new Cron(arg0.getServletContext()), 0, 1000);
         // 0表示Tomcat启动时运行，且不延迟1000表示运行周期为1秒                   
         arg0.getServletContext().log("自动查询用户表已经添加任务调度表");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        timer.cancel();
        arg0.getServletContext().log("自动查询用户表监听器销毁");
    }
	
}
