package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.GuestBO;

public class GuestDAOImpl implements IGuestDAO {
	
	private static final String INSERT_QUERY=" INSERT INTO HOTELGUESTDETAILS VALUES(INTERESTCALCULATOR_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	
	public GuestDAOImpl(DataSource ds) {
		System.out.println("GuestDAOImpl class consturctor");
		this.ds = ds;
	}



	@Override
	public int savedGuestDetails(GuestBO bo) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY);){
				
			if(ps!=null) {
				ps.setString(1,bo.getGuestName());
				ps.setString(2, bo.getGuestAddress());
				ps.setDouble(3, bo.getPerDayCharge());
				ps.setInt(4,bo.getNoOfDayStays());
				ps.setDouble(5, bo.getTotalBillAmt());
				count=ps.executeUpdate();
			}
		}
		return count;
	}

}
