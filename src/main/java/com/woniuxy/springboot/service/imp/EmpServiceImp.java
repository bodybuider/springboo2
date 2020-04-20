package com.woniuxy.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.springboot.entity.Dep;
import com.woniuxy.springboot.entity.Emp;
import com.woniuxy.springboot.mapper.EmpMapper;
import com.woniuxy.springboot.service.EmpService;

@Service
public class EmpServiceImp implements EmpService{
	
	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<Emp> selectEmps() {
		List<Emp> emps = empMapper.selectEmps();
		return emps;
	}

	@Override
	public List<Dep> selectDep() {
		List<Dep> deps=empMapper.selectDep();
		return deps;
	}

	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}

	@Override
	public Emp selectEmpByEid(Integer eid) {
		Emp emp=empMapper.selectEmpByEid(eid);
		return emp;
	}

	@Override
	public void updateEmp(Emp emp) {
		empMapper.updateEmp(emp);
	}

	@Override
	public void deleteEmpByEid(Integer eid) {
		empMapper.deleteEmpByEid(eid);
	}

}
