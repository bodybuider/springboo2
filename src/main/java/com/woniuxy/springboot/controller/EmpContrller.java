package com.woniuxy.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.woniuxy.springboot.entity.Dep;
import com.woniuxy.springboot.entity.Emp;
import com.woniuxy.springboot.service.EmpService;

@Controller
public class EmpContrller {
	@Autowired
	EmpService empService;
	
	@GetMapping("/emps")
	public String toselectEmps(Model model) {
		List<Emp> emps = empService.selectEmps();
		//System.out.println(emps);
		model.addAttribute("emps", emps);
		return "emps";
	}
	
	@GetMapping("/emp")
	public String toselectDep(Model model) {
		List<Dep> deps=empService.selectDep();
		model.addAttribute("deps", deps);
		return "empadd";
	}

	@PostMapping("/emp")
	public String toinsertDep(Emp emp) {
		empService.insertEmp(emp);
		return "redirect:/emps";
	}
	
	
	 @GetMapping("/emp/{eid}") 
	  public String toselectEep(@PathVariable("eid")Integer eid,Model model) { 
		  List<Dep> deps = empService.selectDep();
		  model.addAttribute("deps",deps); 
		  Emp emp= empService.selectEmpByEid(eid);
		  model.addAttribute("emp", emp);
		  return "empedit"; 
	  }
	 @PutMapping("/emp")
		public String toupdateEep(Emp emp) {
		  empService.updateEmp(emp);
		  return "redirect:/emps";
		}
		
	  @DeleteMapping("/emp/{eid}")
		public String toupdateEep(@PathVariable("eid") Integer eid ,Model model) {
		  empService.deleteEmpByEid(eid);
			return "redirect:/emps";
		}
	 
}
