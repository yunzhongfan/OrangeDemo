package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;


/**
 * 
* @ClassName: ServerZipkinApplication 
* @Description: 第九篇 spring cloud seluth(服务链路追踪)
* @author nbc
* @date 2017年12月22日 下午2:53:03 
*
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkinApplication.class, args);
	}
}
