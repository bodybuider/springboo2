package com.woniuxy.springboot.service;

import java.util.List;

import com.woniuxy.springboot.entity.Dep;
import com.woniuxy.springboot.entity.Emp;

public interface EmpService {
	List<Emp> selectEmps();

	List<Dep> selectDep();

	void insertEmp(Emp emp);

	Emp selectEmpByEid(Integer eid);

	void updateEmp(Emp emp);

	void deleteEmpByEid(Integer eid);
}
