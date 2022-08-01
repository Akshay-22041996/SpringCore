package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.PatientBO;

@Component("daobeanclass")
public class PatientDAOImpl implements IPatientDAO {
	
	private static final String REGISTER_PATIENT=" INSERT INTO CORONA_PATIENT_DETAILS VALUES (BANKSEQ.NEXTVAL,?,?,?,?,?)";
	
	
	private DataSource ds;
	
	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAO class:: Datasource is initialize");
		this.ds = ds;
	}



	@Override
	public int registerPatientDetailsInDB(PatientBO bo) throws Exception {
		
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(REGISTER_PATIENT);){
		
			if(ps!=null) {
				ps.setString(1, bo.getPname());
				ps.setString(2, bo.getPadd());
				ps.setDouble(3, bo.getPerDayCharge());
				ps.setInt(4, bo.getNoOfDayAdmit());
				ps.setDouble(5, bo.getTotalBill());
			 count=ps.executeUpdate();	
			}
			return count;
		}
	}

}
