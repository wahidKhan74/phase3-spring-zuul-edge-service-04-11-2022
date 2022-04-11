package com.simplilearn.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Phase3SpringZuulEdgeService04112022Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3SpringZuulEdgeService04112022Application.class, args);
	}

}
