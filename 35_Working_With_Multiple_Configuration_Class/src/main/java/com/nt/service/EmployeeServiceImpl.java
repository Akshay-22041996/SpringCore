package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;


@Component("servicebeanclass")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;

	public EmployeeServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl object is created");
		this.dao = dao;
	}

	@Override
	public String processEmployee(EmployeeDTO dto) throws Exception {
	
		EmployeeBO bo=new EmployeeBO();
		
		double grossSal=dto.getBasicSal()+dto.getBasicSal()*0.4;
		double netSal=grossSal-grossSal*0.2;
		
		bo.setEname(dto.getEname());
		bo.setEaddress(dto.getEaddress());
		bo.setBasicSal(dto.getBasicSal());
		bo.setGrossSal(grossSal);
		bo.setNetSal(netSal);
		
		int count=dao.registerEmployeeDetails(bo);
		
		return count==0?"Employee regisration fails":"Employee Sucessfully registers";
	}

}
