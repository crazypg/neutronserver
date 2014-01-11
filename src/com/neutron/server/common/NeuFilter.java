package com.neutron.server.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class NeuFilter implements Filter {

	private FilterConfig filterConfig=null;
    private String encoding=null;
     
    static Logger logger = Logger.getLogger(NeuFilter.class);
    
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		logger.info("Filter 初始化");
		this.filterConfig=arg0;
        this.encoding=filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
		FilterChain chain) throws IOException, ServletException 
	{
		String encoding=this.encoding;
        if(encoding!=null)
        	req.setCharacterEncoding(encoding);  
        
		HttpServletRequest request = (HttpServletRequest) req;
		logger.info("拦截 URI=" + request.getRequestURI());
		
		chain.doFilter(req, res);
	}

	@Override
	public void destroy() {
		this.encoding=null;
        this.filterConfig=null;
        logger.info("Filter 结束");
	}

}
