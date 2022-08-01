package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String INSERT_QUERY="INSERT INTO EMPLOYEEDB VALUES(INTERESTCALCULATOR_SEQ.NEXTVAL,?,?,?,?,?)";

	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAO class ::1 param constructor");
		this.ds = ds;
	}

	@Override
	public int insertEmployeeDetails(EmployeeBO bo) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY);){
			
			if(ps!=null) {
				ps.setString(1, bo.getEname());
				ps.setString(2, bo.getEaddress());
				ps.setDouble(3, bo.getBasicSalary());
				ps.setDouble(4, bo.getGrossSalary());
				ps.setDouble(5, bo.getNetSalary());
				
				count=ps.executeUpdate();
			}
		}
		return count;
	}

}
