package com.jay.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jay")
@MapperScan("com.jay.springcloud.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptPrivider8001_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptPrivider8001_App.class, args);

	}

}
