package com.woniuxy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("classpath:myspring.xml")
@MapperScan("com.woniuxy.springboot.mapper")
@SpringBootApplication
public class Springboot01Application {

	public static void main(String[] args) {
		System.out.println("zszszszszszs");
		SpringApplication.run(Springboot01Application.class, args);
	}

}
