/**   
* @Title: UserController.java 
* @Package com.example.controller 
* @Description: TODO
* @author nbc  
* @date 2017年12月16日 下午4:03:00 
* @version V1.0
*/
package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;

/** 
* @ClassName: UserController 
* @Description: TODO
* @author nbc
* @date 2017年12月16日 下午4:03:00 
*  
*/
@RestController
@RequestMapping("/user/")
public class UserController {
	
	@ResponseBody
	@RequestMapping(path="getuser",method=RequestMethod.GET ,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User getUser() throws InstantiationException, IllegalAccessException{
		User user = User.class.newInstance();
		user.setAge("23");
		user.setName("张三");
		user.setPassWord("12345");
		return user;
		
	}

}
