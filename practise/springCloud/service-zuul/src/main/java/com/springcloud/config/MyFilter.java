/**   
* @Title: MyFilter.java 
* @Package com.springcloud.config 
* @Description: TODO
* @author nbc  
* @date 2017年12月21日 下午4:09:30 
* @version V1.0
*/
package com.springcloud.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 
 *  zuulde的过滤功能
* @ClassName: MyFilter 
* @Description: TODO
* @author nbc
* @date 2017年12月21日 下午4:09:30 
*  
*/
@Component
public class MyFilter extends ZuulFilter {

	 private static Logger log = LoggerFactory.getLogger(MyFilter.class);
	    @Override
	    public String filterType() {
	        return "pre";
	    }

	    @Override
	    public int filterOrder() {
	        return 0;
	    }

	    @Override
	    public boolean shouldFilter() {
	        return true;
	    }

	    @Override
	    public Object run() {
	        RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();
	        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
	        Object accessToken = request.getParameter("token");
	        if(accessToken == null) {
	            log.warn("token is empty");
	            ctx.setSendZuulResponse(false);
	            ctx.setResponseStatusCode(401);
	            try {
	                ctx.getResponse().getWriter().write("token is empty");
	            }catch (Exception e){}
	            return null;
	        }
	        log.info("ok");
	        return null;
	    }
}
