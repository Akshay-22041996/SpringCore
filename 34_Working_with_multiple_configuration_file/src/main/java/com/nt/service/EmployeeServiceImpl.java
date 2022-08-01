package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Component("service")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	
	private IEmployeeDAO dao;

	public EmployeeServiceImpl(IEmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		double grossSal=dto.getBasicSal()+dto.getBasicSal()*0.4;
		double netSal  =grossSal-grossSal*0.2;
		EmployeeBO bo=new EmployeeBO();
		
		bo.setEname(dto.getEname());
		bo.setEaddress(dto.getEaddress());
		bo.setBasicSal(dto.getBasicSal());
		bo.setGrossSal(grossSal);
		bo.setNetSal(netSal);
		
		int count=dao.enterEmployeeDetails(bo);
		
		return count==0?"Registration is Failed":"Registration is sucessful";
	}

}
