package com.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * 
 * 
* @ClassName: ServiceHiApplication 
* @Description: 第九篇：spring cloud seluth (服务链路追踪)
* @author nbc
* @date 2017年12月22日 下午2:52:14 
*
 */
@SpringBootApplication
@RestController
public class ServiceHiApplication {
	
	private Logger logger = LoggerFactory.getLogger(ServiceHiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}
	
	
	 	@Autowired
	    private RestTemplate restTemplate;

	    @Bean
	    public RestTemplate getRestTemplate(){
	        return new RestTemplate();
	    }

	    @RequestMapping("/hi")
	    public String callHome(){
	      logger.info("calling trace service-hi  ");
	        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
	    }
	    @RequestMapping("/info")
	    public String info(){
	    	 logger.info("calling trace service-hi ");
	        return "i'm service-hi";

	    }

	    @Bean
	    public AlwaysSampler defaultSampler(){
	        return new AlwaysSampler();
	    }
	
}
