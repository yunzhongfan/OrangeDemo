/**   
* @Title: Myfilter.java 
* @Package com.config 
* @Description: TODO
* @author nbc  
* @date 2017年12月18日 上午9:41:54 
* @version V1.0
*/
package com.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/** 
 * 
 * 自定义springboot的filter
* @ClassName: Myfilter 
* @Description: TODO
* @author nbc
* @date 2017年12月18日 上午9:41:54 
*  
*/
public class Myfilter implements Filter{

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Myfilter销毁……");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest  httpServletRequest = (HttpServletRequest) request;
		System.out.println(httpServletRequest.getRequestURI());
		System.out.println(System.currentTimeMillis());
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Myfilter启动……");
		
	}

}
