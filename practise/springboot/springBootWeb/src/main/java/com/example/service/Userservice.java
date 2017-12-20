/**   
* @Title: Userservice.java 
* @Package com.example.service 
* @Description: TODO
* @author nbc  
* @date 2017年12月20日 上午10:19:06 
* @version V1.0
*/
package com.example.service;

import com.jpa.entity.User;
import com.utils.BookProperties;

/** 
* @ClassName: Userservice 
* @Description: TODO
* @author nbc
* @date 2017年12月20日 上午10:19:06 
*  
*/
public interface Userservice {

	/** 
	* @Title: saveUser 
	* @Description: TODO
	* @param @param user
	* @param @return   
	* @return User   
	* @throws 
	*/
	User saveUser(User user);

	/** 
	* @Title: getUser 
	* @Description: TODO
	* @param @return   
	* @return User   
	* @throws 
	*/
	User getUser();

	/** 
	* @Title: getUserBook 
	* @Description: TODO
	* @param @return   
	* @return BookProperties   
	* @throws 
	*/
	BookProperties getUserBook();

}
