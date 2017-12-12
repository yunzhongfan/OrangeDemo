package com.springBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@ImportResource(locations={"classpath:/configer.yml"})
@PropertySource(value={"classpath:/configer.yml"})
public class SpringBootDemoChart6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoChart6Application.class, args);
	}
}
