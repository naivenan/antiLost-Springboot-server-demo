package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class SpringdemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
		
		System.out.println("*****************************************");
		System.out.println("naivenan: main is running...");
		System.out.println("*****************************************");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		System.out.println("*****************************************");
		System.out.println("naivenan: configure is running...");
		System.out.println("*****************************************");
		
		return builder.sources(SpringdemoApplication.class);
	}

}
