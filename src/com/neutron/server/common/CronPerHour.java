package com.neutron.server.common;

import java.util.Calendar;
import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class CronPerHour extends TimerTask{

	public CronPerHour() {
		super();
	}
	
//    private static final int C_SCHEDULE_HOUR = 10;// 这个代表10点钟的时候执行任务
    private static boolean isRunning = false;
    private ServletContext context = null;
    private CalModel cmModel = new CalModel();
    
    
    public CronPerHour(ServletContext context) {
        this.context = context;
//        ServletContext servletContext = request.getSession().getServletContext(); 
        
    }
    
	@Override
	public void run() {
		Calendar cal = Calendar.getInstance();
		
		//TODO cut users into serveral group
		
		if (!isRunning) {
			//TODO remember CHANGE the exe TIME!!!!!!!
			if (0 == cal.get(Calendar.MINUTE)%5) {	//exec per Hour
				isRunning = true;
				context.log(Calendar.getInstance().getTime()+":定时任务开始执行");
				
//				System.out.println(Util.getProper(new File(this.getClass().getResource("").getPath())+"").getProperty("avatar.size"));
				//执行计算
				cmModel.processRmrIndex();
				cmModel.processRmr();
				
				isRunning = false;
				context.log(Calendar.getInstance().getTime()+":定时任务执行结束");
			}
		} else {
			context.log("上一次任务执行还未结束");
		}
	}
	
	public void init() throws ServletException {
    }

}
