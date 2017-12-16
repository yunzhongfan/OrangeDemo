/**   
* @Title: Ch6Applcation.java 
* @Package com.springBoot.demo 
* @Description: TODO
* @author nbc  
* @date 2017年12月12日 下午2:44:32 
* @version V1.0
*/
package com.springBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springBoot.entitry.AuthorSettings;

/** 
* @ClassName: Ch6Applcation 
* @Description: TODO
* @author nbc
* @date 2017年12月12日 下午2:44:32 
*  
*/

@Controller
public class Ch6Applcation {
	
	@Value("${book.author}")
	private  String  bookAuthor;
	@Value("${book.name}")
	private  String bookName;
	
	@Autowired
	private  AuthorSettings authorSettings;
	
	@Autowired
	private  Environment env;
	
	@RequestMapping(value="/bookinfo")
	public  String index(){
		return  bookAuthor + bookName;
	}
	
	
	@RequestMapping(value="/env")
	public  String env(){
		return  env.getProperty("book.author");
	}
	
	
	@RequestMapping(value="/authorSettings")
	public  String authorSettings(){
		return  authorSettings.getName()+authorSettings.getAge();
	}
	

}
