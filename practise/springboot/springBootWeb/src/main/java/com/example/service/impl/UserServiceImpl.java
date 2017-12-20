/**   
* @Title: UserServiceImpl.java 
* @Package com.example.service.impl 
* @Description: TODO
* @author nbc  
* @date 2017年12月20日 上午10:19:56 
* @version V1.0
*/
package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.Userservice;
import com.jpa.entity.User;
import com.jpa.responsity.UserInfo;
import com.utils.BookProperties;

/** 
* @ClassName: UserServiceImpl 
* @Description: TODO
* @author nbc
* @date 2017年12月20日 上午10:19:56 
*  
*/

@Service
public class UserServiceImpl implements Userservice {
	
	@Autowired
	private  BookProperties bookProperties;

	@Autowired
	private UserInfo  userInfo;
	@Override
	public User saveUser(User user) {
		return userInfo.save(user);
	}
	@Override
	public User getUser() {
		try {
			User user = User.class.newInstance();
			user.setAge(23);
			user.setName("张三");
			user.setPassWord("12345");
			return user;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	/* (non-Javadoc)
	 * 测试加载资料
	 */
	@Override
	public BookProperties getUserBook() {
		return bookProperties;
	}

}
