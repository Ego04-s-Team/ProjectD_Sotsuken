package com.ProjectD.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootTestProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestProject1Application.class, args);
	}

}
