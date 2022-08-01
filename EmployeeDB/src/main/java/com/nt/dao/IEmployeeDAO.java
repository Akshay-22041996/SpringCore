package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
	
	public int insertEmployeeDetails(EmployeeBO bo) throws Exception;
}
