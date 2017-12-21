/**   
* @Title: SchedualServiceHiHystric.java 
* @Package com.springcloud.service 
* @Description: TODO
* @author nbc  
* @date 2017年12月21日 上午11:29:58 
* @version V1.0
*/
package com.springcloud.service;

import org.springframework.stereotype.Component;

/** 
 * 
 * springCloud服务调用fegin
 * 断路处理：
* @ClassName: SchedualServiceHiHystric 
* @Description: TODO
* @author nbc
* @date 2017年12月21日 上午11:29:58 
*  
*/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
