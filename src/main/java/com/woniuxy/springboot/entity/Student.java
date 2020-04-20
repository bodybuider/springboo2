package com.woniuxy.springboot.entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix="student")
//properties文件可以加载自定义的文件
@PropertySource("classpath:student.properties")
public class Student {
	//@Value("55")
	private Integer sid;
	//@Value("${student.sname}")
	private String sname;
	private List<String> list;
	private Map<String, String> map;
	private School school;
	
}
