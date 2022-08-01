package com.nt.servise;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements IEmployeeManageService {
	
	private IEmployeeDAO dao;
	
	public EmployeeServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl class:: 1 param constructor");
		this.dao = dao;
	}

	@Override
	public String registerEmployeeDetails(EmployeeDTO dto) throws Exception {
		
		double grossSalary=dto.getBasicSalary()+dto.getBasicSalary()*0.04;
		double netSalary=grossSalary-grossSalary*0.02;
		
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEaddress(dto.getEaddress());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		int count=dao.insertEmployeeDetails(bo);
		return count==0?"Registration failed":"Registration succesful";
	}

}
