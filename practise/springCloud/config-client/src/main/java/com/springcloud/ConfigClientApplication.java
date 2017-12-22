package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* @ClassName: ConfigClientApplication 
* @Description: springcloud的分布式配置中心 :server-celient配置
* @author nbc
* @date 2017年12月22日 上午9:42:53 
*
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	
	//获取远程仓库git上的配置信息
	@Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
