/**   
* @Title: WebIntilazer.java 
* @Package config 
* @Description: web配置
* @author nbc  
* @date 2017年12月6日 下午1:57:46 
* @version V1.0
*/
package config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/** 
* @ClassName: WebIntilazer 
* @Description: TODO
* @author nbc
* @date 2017年12月6日 下午1:57:46 
*  
*/
public class WebIntilazer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext  annotationConfigApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigApplicationContext.register(WebConfig.class);
		annotationConfigApplicationContext.setServletContext(servletContext);
		javax.servlet.ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(annotationConfigApplicationContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
