/**   
* @Title: RootConfig.java 
* @Package config 
* @Description: TODO
* @author nbc  
* @date 2017年12月5日 下午4:00:14 
* @version V1.0
*/
package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * 
 * @ClassName: RootConfig
 * @Description: 设置基于注解的
 * @author nbc
 * @date 2017年12月5日 下午4:00:14
 * 
 */

@Configuration
@ComponentScan(basePackages = { "demo1" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig {

}
