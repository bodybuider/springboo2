package com.woniuxy.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.woniuxy.springboot.entity.School;
import com.woniuxy.springboot.entity.Student;
import com.woniuxy.springboot.service.MyService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class Springboot01ApplicationTests {
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	Student student;
	
	@Autowired
	MyService myService;
	
	@Autowired
	School school;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
		System.out.println(ac.containsBean("getMyService"));
		System.out.println(ac.containsBean("myService"));
	}

	@Test
	void test2() {
		log.trace("mytrace");
		log.info("myinfo");
		log.debug("mydebug");
		log.warn("mywarn");
		log.error("myerror");
	}

}
