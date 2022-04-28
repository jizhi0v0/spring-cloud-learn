package com.jay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jay.springcloud")
public class Config_Client_3355_App {
	
	public static void main(String[] args) {
		SpringApplication.run(Config_Client_3355_App.class, args);
	}

}
