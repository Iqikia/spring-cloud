package com.project.ribbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@Slf4j
public class ServiceRibbonApplication {

	@Bean
	@LoadBalanced // 表明这个restRemplate开启负载均衡的功能
	RestTemplate restTemplate() {
		log.info("Create rest template.");
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

}

