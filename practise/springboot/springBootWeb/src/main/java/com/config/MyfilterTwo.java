/**   
* @Title: MyfilterTwo.java 
* @Package com.config 
* @Description: TODO
* @author nbc  
* @date 2017年12月19日 上午10:45:56 
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

/** 
* @ClassName: MyfilterTwo 
* @Description: TODO
* @author nbc
* @date 2017年12月19日 上午10:45:56 
*  
*/
public class MyfilterTwo implements Filter {

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		System.out.println("FilterTwo……被销毁了");

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("第二个Filter");
		System.out.println(request.getContentLength());
		filterChain.doFilter(request, response);

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("FilterTwo……开始了");
		System.out.println(filterConfig.getServletContext());

	}

}
