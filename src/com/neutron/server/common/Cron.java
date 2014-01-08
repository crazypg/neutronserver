package com.neutron.server.common;

import java.util.Calendar;
import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class Cron extends TimerTask{

	public Cron() {
		super();
	}
	
    private static final int C_SCHEDULE_HOUR = 10;// 这个代表10点钟的时候执行任务
    private static boolean isRunning = false;
    private ServletContext context = null;
    
    public Cron(ServletContext context) {
        this.context = context;
        //ServletContext servletContext = request.getSession().getServletContext(); 
        
    }
    
	@Override
	public void run() {
		Calendar cal = Calendar.getInstance();
		if (!isRunning) {
			if (C_SCHEDULE_HOUR == cal.get(Calendar.HOUR_OF_DAY)) {
				isRunning = true;

				// TODO
				
				isRunning = false;
			}
		} else {
			context.log("上一次任务执行还未结束");
		}
	}
	
	public void init() throws ServletException {
    }

}
