/**   
* @Title: WebConfig.java 
* @Package com.config 
* @Description: TODO
* @author nbc  
* @date 2017年12月16日 下午3:30:07 
* @version V1.0
*/
package com.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/** 
* @ClassName: WebConfig 
* @Description: TODO
* @author nbc
* @date 2017年12月16日 下午3:30:07 
*  
*/

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	


	/**
	 * 测试不同
	 * jsp视图解析
	* @Title: webViewResolver 
	* @Description: TODO
	* @param @return   
	* @return ViewResolver   
	* @throws
	 */
	@Bean
	public ViewResolver webViewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WBE-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
	
	
	/**
	 * 
	 * 未测试
	 * Json解析
	* @Title: mappingJackson2JsonView 
	* @Description: TODO
	* @param @return   
	* @return MappingJackson2JsonView   
	* @throws
	 */
	@Bean
	public MappingJackson2JsonView mappingJackson2JsonView(){
		MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();
		return mappingJackson2JsonView;
		
	}
	
	
	/**
	 * 
	 * 定义拦截器  One
	* @Title: registrationBeanOne 
	* @Description: TODO
	* @param @return   
	* @return FilterRegistrationBean   
	* @throws
	 */
	@Bean
	public  FilterRegistrationBean  registrationBeanOne(){
		FilterRegistrationBean  filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new Myfilter());
		filterRegistrationBean.addUrlPatterns("/user/*");
		//filterRegistrationBean.setInitParameters("name", "liqing");
		filterRegistrationBean.setName("Myfilter");
		filterRegistrationBean.setOrder(1);
		return filterRegistrationBean;
		
	}
	
	
	/**
	 * 
	 * 定义拦截器 Two
	* @Title: registrationBeanOne 
	* @Description: TODO
	* @param @return   
	* @return FilterRegistrationBean   
	* @throws
	 */
	@Bean
	public  FilterRegistrationBean  registrationBeanTwo(){
		FilterRegistrationBean  filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new MyfilterTwo());
		filterRegistrationBean.addUrlPatterns("/user/*");
		//filterRegistrationBean.setInitParameters("name", "liqing");
		filterRegistrationBean.setName("MyfilterTwo");
		filterRegistrationBean.setOrder(1);
		return filterRegistrationBean;
		
	}
	
	
	/**
	 * 
	 * 未测试
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
	 * 未测试
	 * 通过注册声称 Servlet 、filter、lister
	 */
	
	
	
}
