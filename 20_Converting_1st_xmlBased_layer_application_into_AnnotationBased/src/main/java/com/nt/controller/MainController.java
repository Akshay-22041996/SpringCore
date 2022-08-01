package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.bo.EmployeeBO;
import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeServiceManage;
import com.nt.vo.EmployeeVO;

@Controller("controllerid")

public class MainController {
	
	@Autowired
	private IEmployeeServiceManage service;

	public MainController(IEmployeeServiceManage service) {
		super();
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo) throws Exception{
		
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setBasicSal(Double.parseDouble(vo.getBasicSal()));
		
		String msg=service.registerEmployee(dto);
		return msg;
	}
}
