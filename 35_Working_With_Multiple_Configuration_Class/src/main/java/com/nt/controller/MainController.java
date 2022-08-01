package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

@Component("mainbeanclass")
public class MainController {

	@Autowired
	private IEmployeeService service;

	public MainController(IEmployeeService service) {
		super();
		this.service = service;
	}
	
	public String startSavingEmployeeDeatils(EmployeeVO vo) throws Exception{
		
		EmployeeDTO dto=new EmployeeDTO();
		
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setBasicSal(Double.parseDouble(vo.getBasicSal()));
		
		String msg=service.processEmployee(dto);
		
		return msg;
	}
	
}
