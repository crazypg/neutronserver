package com.neutron.server.common;

import java.io.File;
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
    	 arg0.getServletContext().log("后台任务监听器已启动");
         timer.schedule(new CronPerHour(arg0.getServletContext()), 0, 
        		 Integer.valueOf(Util.getProper(new File(this.getClass().getResource("").getPath())+"").getProperty("cron.interval")));
         // 0表示Tomcat启动时运行，且不延迟1000表示运行周期为1秒                   
         arg0.getServletContext().log("操作已经添加任务调度表");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        timer.cancel();
        arg0.getServletContext().log("后台任务监听器已销毁");
    }
	
}
