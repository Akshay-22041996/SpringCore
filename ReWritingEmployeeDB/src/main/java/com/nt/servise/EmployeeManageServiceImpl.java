package com.nt.servise;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeManageServiceImpl implements IEmployeeManageService {
	private IEmployeeDAO dao;
	
	public EmployeeManageServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeSevice class :: 0 param constuctor");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		
		double grossSal=dto.getbSalary()+dto.getbSalary()*0.04;
		double netSal=grossSal-grossSal*0.02;
		
		EmployeeBO bo=new EmployeeBO();
		bo.setbSalary(dto.getbSalary());
		bo.setEaddress(dto.getEaddress());
		bo.setEname(dto.getEname());
		bo.setgSalary(grossSal);
		bo.setnSalary(netSal);
		
		int count=dao.saveEmployeeDetails(bo);
		
		return count==0?"Registration failed":"Registration sucessful";
	}

}
