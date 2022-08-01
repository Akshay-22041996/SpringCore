package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {

	public int registerEmployeeDetails(EmployeeBO bo) throws Exception;
}
