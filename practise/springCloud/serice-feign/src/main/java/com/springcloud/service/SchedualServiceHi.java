/**   
* @Title: SchedualServiceHi.java 
* @Package com.springcloud.service 
* @Description: TODO
* @author nbc  
* @date 2017年12月21日 上午10:55:15 
* @version V1.0
*/
package com.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * springCloud的服务调用方式二：fegin
 *  
* @ClassName: SchedualServiceHi 
* @Description: TODO
* @author nbc
* @date 2017年12月21日 上午10:55:15 
*  
*/
@Service
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

	/** 
	* @Title: sayHiFromClientOne 
	* @Description: TODO
	* @param @param name
	* @param @return   
	* @return String   
	* @throws 
	*/
	@RequestMapping(path="/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value="name") String name);
	
	
	//添加断路器处理方法

}
