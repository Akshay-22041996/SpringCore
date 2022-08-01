package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.servise.IEmployeeManageService;
import com.nt.vo.EmployeeVO;

public class MainController {
	
	private IEmployeeManageService service;

	public MainController(IEmployeeManageService service) {
		System.out.println("MainController class::1 param constructor");
		this.service = service;
	}
	
	public String processEmployeeDetails(EmployeeVO vo) throws Exception{
		
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setBasicSalary(Double.parseDouble(vo.getBasicSalary()));
		
		String msg=service.registerEmployeeDetails(dto);
		return msg;
	}
	
	
}
