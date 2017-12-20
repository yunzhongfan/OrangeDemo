/**   
* @Title: User.java 
* @Package com.springboot.entity 
* @Description: TODO
* @author nbc  
* @date 2017年12月19日 下午4:05:36 
* @version V1.0
*/
package com.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/** 
* @ClassName: User 
* @Description: TODO
* @author nbc
* @date 2017年12月19日 下午4:05:36 
*  
*/

@Data
@Entity
@Table(name = "user")
public class User implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = -7362371894429216969L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  long id;
	
	private  String  name;
	
	private  String  passWord;
	
	private  int age;

}
