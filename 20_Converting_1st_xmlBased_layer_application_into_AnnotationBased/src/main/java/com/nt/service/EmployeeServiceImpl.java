package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("serviceid")
public class EmployeeServiceImpl implements IEmployeeServiceManage {
	@Autowired
	private IEmployeeDAO dao;

	public EmployeeServiceImpl(IEmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		
		Double grossSal=dto.getBasicSal()+dto.getBasicSal()*0.04;
		Double netSal=grossSal-grossSal*.02;
		
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEaddress(dto.getEaddress());
		bo.setBasicSal(dto.getBasicSal());
		bo.setNetSal(netSal);
		bo.setGrosssal(grossSal);
		
		int count=dao.registerEmployee(bo);
		
		return count==0?"Registration failed":"Registration Sucessful";
	}

}
