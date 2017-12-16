package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
* @ClassName: MyMVConfig 
* @Description: 基于Java注解的方式配置MVC
* @author nbc
* @date 2017年12月5日 下午3:25:47 
*
 */

@Configuration
@EnableWebMvc
@ComponentScan(value={"demo1"})
public class WebConfig extends WebMvcConfigurerAdapter{
	
	/**
	 * 设置JSP视图解析
	* @Title: webViewResole 
	* @Description: TODO
	* @param @return   
	* @return ViewResolver   
	* @throws
	 */
	@Bean
	public  ViewResolver  webViewResole(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");     
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setExposeContextBeansAsAttributes(true);
		return internalResourceViewResolver;
	}
	
	
	/**
	 * 处置静态资源处理:默认的静态资源访问路径
	* @Title: configrationDefaultHadling 
	* @Description: TODO
	* @param @param defaultServletHandlerConfigurer   
	* @return void   
	* @throws
	 */
	/*public void configrationDefaultHadling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer){
		defaultServletHandlerConfigurer.enable();
	}*/
	
	/**
	 * 添加静态资源处理：指定静态文件的位置
	 * 参考：springBoot开发的颠覆者
	* @Title: addResourcesHadling 
	* @Description: TODO
	* @param @param registry   
	* @return void   
	* @throws
	 */
	public  void addResourcesHadling(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}
	
	/**
	 * 将拦截器注册到spring容器中
	* @Title: demoInterceptor 
	* @Description: TODO
	* @param @return   
	* @return DemoInterceptor   
	* @throws
	 */
	@Bean
	public  DemoInterceptor demoInterceptor(){
		return new DemoInterceptor();
	}
	/**
	 * 注册自定义的拦截器
	 */
	public  void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(demoInterceptor());
	}
	

}
