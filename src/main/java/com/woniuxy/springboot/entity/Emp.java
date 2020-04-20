package com.woniuxy.springboot.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	private Integer eid;
	private String ename;
	private Date jiondate;
	private Dep dep;
}
