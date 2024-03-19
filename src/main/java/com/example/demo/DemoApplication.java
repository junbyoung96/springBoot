package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DemoApplication.class);
		//application.setWebApplicationType(WebApplicationType.NONE); 스프링 프로젝트를 자바프로그램으로 설정.
		//application.setWebApplicationType(WebApplicationType.REACTIVE); 스프링 프로젝트를 비동기 처리 , 논블로킹 방식의 웹으로설정.
		application.setWebApplicationType(WebApplicationType.SERVLET); //스프링 프로젝트를 웹으로 설정.
		//배너 on/off
		//application.setBannerMode(Banner.Mode.OFF);
		
		application.run(args);
		
		
		
		
		//SpringApplication.run(DemoApplication.class, args);
		
	}

}
