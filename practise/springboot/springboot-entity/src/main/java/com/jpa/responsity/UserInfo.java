/**   
* @Title: UserInfo.java 
* @Package com.springboot.responsity 
* @Description: TODO
* @author nbc  
* @date 2017年12月19日 下午4:07:18 
* @version V1.0
*/
package com.jpa.responsity;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.User;

/** 
* @ClassName: UserInfo 
* @Description: TODO
* @author nbc
* @date 2017年12月19日 下午4:07:18 
*  
*/
public interface UserInfo extends JpaRepository<User, Serializable>{

}
