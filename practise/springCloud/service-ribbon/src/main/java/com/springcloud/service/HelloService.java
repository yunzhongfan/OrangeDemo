/**   
* @Title: HelloService.java 
* @Package com.springcloud.service 
* @Description: TODO
* @author nbc  
* @date 2017年12月20日 下午5:35:39 
* @version V1.0
*/
package com.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/** 
* @ClassName: HelloService 
* @Description: TODO
* @author nbc
* @date 2017年12月20日 下午5:35:39 
*  
*/
@Service
public class HelloService {
	
	@Autowired
    RestTemplate restTemplate;


	/** 
	* @Title: hiService 
	* @Description: TODO
	* @param @param name
	* @param @return   
	* @return String   
	* @throws 
	*/
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		 return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
	}
	
	public  String hiError(String name){
		return "hi,"+name+",sorry,Ribbonerror!";
		
	}


}
