package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 
* @ClassName: ConfigServerApplication 
* @Description: springcloud的分布式配置中心：server-config配置
* @author nbc
* @date 2017年12月22日 上午9:44:31 
*
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer  //第七节配置高可用分布式中心
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
