/**   
* @Title: UserController.java 
* @Package com.example.controller 
* @Description: TODO
* @author nbc  
* @date 2017年12月16日 下午4:03:00 
* @version V1.0
*/
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.entity.User;
import com.springboot.responsity.UserInfo;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author nbc
 * @date 2017年12月16日 下午4:03:00
 * 
 */
@Controller
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private UserInfo userInfo;

	@ResponseBody
	@RequestMapping(path = "getuser", method = RequestMethod.GET)
	public User getUser() throws InstantiationException, IllegalAccessException {
		User user = User.class.newInstance();
		user.setAge(23);
		user.setName("张三");
		user.setPassWord("12345");
		return user;
	}

	@RequestMapping(path = "info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String userInfo() {
		User user = new User();
		user.setAge(23);
		user.setName("张三");
		user.setPassWord("12345");
		return "hello";
	}

	@ResponseBody
	@RequestMapping(path = "addUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User addUser() {
		User user = new User();
		try{
			user.setAge(24);
			user.setName("张四");
			user.setPassWord("4");
			user = userInfo.saveAndFlush(user);
			return user;
		}catch(Exception e){
			e.printStackTrace();
//			throw new IllegalArgumentException("抱歉，参数异常/ 来自@ModelAttribute:");
			
		}
		return user;
	}

}
