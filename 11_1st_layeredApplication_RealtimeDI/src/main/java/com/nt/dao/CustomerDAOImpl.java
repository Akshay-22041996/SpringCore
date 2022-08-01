package com.nt.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBo;

public class CustomerDAOImpl implements ICustomerDAO {

	private static final String CUSTOMER_INSERTION="INSERT INTO REALTIMEDI_INTERESTCALCULATOR  VALUES(INTERESTCALCULATOR_SEQ.NEXTVAL,?,?,?,?)";
	
	private DataSource ds;
	
	
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl:: 1 param constructor");
		this.ds = ds;
	}


	@Override
	public int savedCustomer(CustomerBo custbo) throws Exception {
		
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement("CUSTOMER_INSERTION");){
			
			if(ps !=null) {
				ps.setString(1, custbo.getCname());
				ps.setString(2, custbo.getCaddre());
				ps.setDouble(3, custbo.getPamt());
				ps.setDouble(4, custbo.getInterestAmt());
				count=ps.executeUpdate();
				System.out.println("dao class method call complete");
			}
		}catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
