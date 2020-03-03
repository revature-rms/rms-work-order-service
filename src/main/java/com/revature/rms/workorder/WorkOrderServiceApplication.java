package com.revature.rms.workorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WorkOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkOrderServiceApplication.class, args);
	}

}
