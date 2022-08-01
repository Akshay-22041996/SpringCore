package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
	
	public int saveEmployeeDetails(EmployeeBO bo) throws Exception;
}
