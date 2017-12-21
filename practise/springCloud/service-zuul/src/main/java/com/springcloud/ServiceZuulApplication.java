package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * springCloud的智能路由
 * 路由网关
* @ClassName: ServiceZuulApplication 
* @Description: TODO
* @author nbc
* @date 2017年12月21日 下午3:46:37 
*
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}
