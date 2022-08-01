package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("daoid")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	
	private static final String INSERTEMPLOYEEDETAILS="INSERT INTO EMPLOYEEDB VALUES(INTERESTCALCULATOR_SEQ.NEXTVAL,?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int registerEmployee(EmployeeBO bo) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERTEMPLOYEEDETAILS)){
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getEaddress());
			ps.setDouble(3, bo.getBasicSal());
			ps.setDouble(4, bo.getGrosssal());
			ps.setDouble(5, bo.getNetSal());
			count=ps.executeUpdate();
		}
		
		return count;		
	}

}
