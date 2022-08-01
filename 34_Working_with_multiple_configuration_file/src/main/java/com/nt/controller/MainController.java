package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

@Component("controller")
public class MainController {
	@Autowired
	IEmployeeService service;

	public MainController(IEmployeeService service) {
		super();
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo) throws Exception{
		
		EmployeeDTO dto=new EmployeeDTO();
		
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setBasicSal(Double.parseDouble(vo.getBasicSal()));
		
		service.registerEmployee(dto);
		
		return "Employee details registration is started";
	}
	
}
