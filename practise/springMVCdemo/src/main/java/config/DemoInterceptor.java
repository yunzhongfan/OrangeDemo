/**   
* @Title: DemoInterceptor.java 
* @Package config 
* @Description: TODO
* @author nbc  
* @date 2017年12月7日 上午11:31:32 
* @version V1.0
*/
package config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/** 
 * 参考springBoot开发的颠覆者
 * 自定义springMVC拦截器
* @ClassName: DemoInterceptor 
* @Description: TODO
* @author nbc
* @date 2017年12月7日 上午11:31:32 
*  
*/
public class DemoInterceptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handle){
	long stratTime = System.currentTimeMillis();
		request.setAttribute("startTime", stratTime);
		return true;
	}
	
	
	public  void postHandle(HttpServletRequest request,HttpServletResponse response,Object handle,ModelAndView ciew){
		long stratTime = (long)request.getAttribute("startTime");
		long entTime = System.currentTimeMillis();
		System.out.println("本次请求处理时间为："+(entTime-stratTime));
		request.setAttribute("handleTime", (entTime-stratTime));
	}
	
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }
}
