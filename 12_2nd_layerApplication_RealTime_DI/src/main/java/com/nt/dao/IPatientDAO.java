package com.nt.dao;

import com.nt.bo.PatientBO;

public interface IPatientDAO {
	
	public int insertPatientRecord(PatientBO bo) throws Exception;
}
