/**   
* @Title: HiController.java 
* @Package com.springcloud.conroller 
* @Description: TODO
* @author nbc  
* @date 2017年12月21日 上午10:51:24 
* @version V1.0
*/
package com.springcloud.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.SchedualServiceHi;

/** 
 * 
 * springCloud的服务调度方式二：fegin
* @ClassName: HiController 
* @Description: TODO
* @author nbc
* @date 2017年12月21日 上午10:51:24 
*  
*/

@RestController
public class HiController {
	@Autowired
	private SchedualServiceHi  schedualServiceHi;
	
	@RequestMapping(path = "/hi",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
