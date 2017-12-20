/**   
* @Title: ServiceProperties.java 
* @Package com.utils 
* @Description: TODO
* @author nbc  
* @date 2017年12月20日 上午11:02:44 
* @version V1.0
*/
package com.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/** 
 * 
 * 测试springboot创建多个modul功能
* @ClassName: ServiceProperties 
* @Description: TODO
* @author nbc
* @date 2017年12月20日 上午11:02:44 
*  prefix = "girl"
*/

@Data
@ConfigurationProperties(prefix = "book")
@Component
public class BookProperties { 
	
	private String bookName;

    private long price;

}
