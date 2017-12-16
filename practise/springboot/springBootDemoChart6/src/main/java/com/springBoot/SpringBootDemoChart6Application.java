package com.springBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude={ HibernateJpaAutoConfiguration.class})
@ImportResource(locations={"classpath:/config/datasources.xml"})  //引入别的xml文件配置
@ConfigurationProperties(locations="/config/configer.properties",prefix="author")
public class SpringBootDemoChart6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoChart6Application.class, args);
	}
}
