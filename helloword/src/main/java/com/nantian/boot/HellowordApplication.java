package com.nantian.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
//导入自定义spring配置文件
@ImportResource(locations="classpath:beans.xml")
@SpringBootApplication
public class HellowordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}
}
