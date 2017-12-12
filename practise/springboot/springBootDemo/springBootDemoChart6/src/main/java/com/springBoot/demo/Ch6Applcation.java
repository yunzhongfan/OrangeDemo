/**   
* @Title: Ch6Applcation.java 
* @Package com.springBoot.demo 
* @Description: TODO
* @author nbc  
* @date 2017年12月12日 下午2:44:32 
* @version V1.0
*/
package com.springBoot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @ClassName: Ch6Applcation 
* @Description: TODO
* @author nbc
* @date 2017年12月12日 下午2:44:32 
*  
*/

@Controller
@RequestMapping(path="/book/")
public class Ch6Applcation {
	
	@Value("${book.author}")
	private  String  bookAuthor;
	@Value("${book.name}")
	private  String bookName;
	
	@RequestMapping(path="bookinfo")
	public  String index(){
		return  bookAuthor + bookName;
	}
	
	
	

}
