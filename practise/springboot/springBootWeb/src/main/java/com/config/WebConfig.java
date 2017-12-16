/**   
* @Title: WebConfig.java 
* @Package com.config 
* @Description: TODO
* @author nbc  
* @date 2017年12月16日 下午3:30:07 
* @version V1.0
*/
package com.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fasterxml.jackson.annotation.JsonView;

/** 
* @ClassName: WebConfig 
* @Description: TODO
* @author nbc
* @date 2017年12月16日 下午3:30:07 
*  
*/

@Configuration
@EnableAutoConfiguration
public class WebConfig {
	
	/**
	 * jsp视图解析
	* @Title: webViewResolver 
	* @Description: TODO
	* @param @return   
	* @return ViewResolver   
	* @throws
	 */
	public ViewResolver webViewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		return internalResourceViewResolver;
		
	}
	
	
	/**
	 * Json解析
	* @Title: mappingJackson2JsonView 
	* @Description: TODO
	* @param @return   
	* @return MappingJackson2JsonView   
	* @throws
	 */
	
	public MappingJackson2JsonView mappingJackson2JsonView(){
		MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();
		return mappingJackson2JsonView;
		
	}
}
