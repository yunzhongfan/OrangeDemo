/**   
* @Title: HelloControler.java 
* @Package com.springcloud.controller 
* @Description: TODO
* @author nbc  
* @date 2017年12月20日 下午5:36:28 
* @version V1.0
*/
package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.HelloService;

/** 
* @ClassName: HelloControler 
* @Description: TODO
* @author nbc
* @date 2017年12月20日 下午5:36:28 
*  
*/
@RestController
public class HelloControler {
	
	 @Autowired
	 HelloService helloService;
	 @RequestMapping(value = "/hi")
	 public String hi(@RequestParam String name){
	        return helloService.hiService(name);
	    }
}
