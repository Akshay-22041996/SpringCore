package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String INSERT_QUERY="insert into employeeDB values(InterestCalculator_seq.nextval,?,?,?,?,?)";
	private DataSource ds;
	
		public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImple class ::0 param constructor");
		this.ds = ds;
	}


	@Override
	public int saveEmployeeDetails(EmployeeBO bo) throws Exception {
		
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY);){
			if(ps !=null) {
				ps.setString(1, bo.getEname());
				ps.setString(2, bo.getEaddress());
				ps.setDouble(3, bo.getbSalary());
				ps.setDouble(4, bo.getgSalary());
				ps.setDouble(5, bo.getnSalary());
				
				count=ps.executeUpdate();
			}
		}
		return count;
	}

}
