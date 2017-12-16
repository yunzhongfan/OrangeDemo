/**   
* @Title: Book.java 
* @Package com.springBoot.entitry 
* @Description: TODO
* @author nbc  
* @date 2017年12月16日 上午9:52:41 
* @version V1.0
*/
package com.springBoot.entitry;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** 
* @ClassName: Book 
* @Description: TODO
* @author nbc
* @date 2017年12月16日 上午9:52:41 
*  
*/

@Component
public class AuthorSettings {
	
	private  String  name;
	
	private  long  age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public long getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(long age) {
		this.age = age;
	}

	
	
}
