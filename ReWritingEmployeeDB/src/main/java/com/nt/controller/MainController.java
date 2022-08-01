package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.servise.IEmployeeManageService;
import com.nt.vo.EmployeeVO;

public class MainController {
	
	private IEmployeeManageService service;

	public MainController(IEmployeeManageService service) {
		System.out.println("Controller class:0 param constructor");
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo) throws Exception{
		
		EmployeeDTO dto=new EmployeeDTO();
		
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setbSalary(Double.parseDouble(vo.getbSalary()));
	
		String msg=service.registerEmployee(dto);
		return msg;
		
	}
	
	
}
