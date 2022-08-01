package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.EmployeeBO;


@Component("daobeanclass")
public class EmployeeDAOImpl implements IEmployeeDAO{
	
	private static final String SAVE_EMPLOYEE_DETAILS="INSERT INTO EMPLOYEEDB VALUES(BANKSEQ.NEXTVAL,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int registerEmployeeDetails(EmployeeBO bo) throws Exception {
		
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(SAVE_EMPLOYEE_DETAILS);){
			
			if(ps !=null) {
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getEaddress());
			ps.setDouble(3, bo.getBasicSal());
			ps.setDouble(4, bo.getGrossSal());
			ps.setDouble(5, bo.getNetSal());
			
			 count=ps.executeUpdate();
			
			}
			return count;
		}
	}
	
	
}
