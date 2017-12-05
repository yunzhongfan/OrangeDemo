/**   
* @Title: UserController.java 
* @Package demo1 
* @Description: TODO
* @author nbc  
* @date 2017年12月5日 下午4:13:51 
* @version V1.0
*/
package demo1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @ClassName: UserController 
* @Description: TODO
* @author nbc
* @date 2017年12月5日 下午4:13:51 
*  
*/

@RestController
@RequestMapping(path="/user",value="",produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
	
	

}
