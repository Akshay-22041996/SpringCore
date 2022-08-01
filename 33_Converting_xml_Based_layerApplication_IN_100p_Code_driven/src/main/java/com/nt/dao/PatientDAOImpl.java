package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.PatientBO;

@Repository("patientDAO")
public class PatientDAOImpl implements IPatientDAO {

	private static final String PATIENT_INSERTION_QUERY=" INSERT INTO CORONA_PATIENT_DETAILS VALUES(INTERESTCALCULATOR_SEQ.NEXTVAL,?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	
	
	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAOImpl::1 param constructor");
		this.ds = ds;
	}


	@Override
	public int insertPatientRecord(PatientBO patientbo) throws Exception {
		System.out.println("PatientDAO class ::insertpatient method");
		int count=0;
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(PATIENT_INSERTION_QUERY);){
		
			if(ps !=null) {
				ps.setString(1, patientbo.getPname());
				ps.setString(2, patientbo.getPaddress());
				ps.setDouble(3, patientbo.getPerDayCharge());
				ps.setInt(4, patientbo.getNoOfDayAdmit());
				ps.setDouble(5, patientbo.getTotalBillAmt());
				count=ps.executeUpdate();
			}
		}
		return count;
	}

}
