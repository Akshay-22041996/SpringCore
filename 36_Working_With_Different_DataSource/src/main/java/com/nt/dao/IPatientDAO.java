package com.nt.dao;

import com.nt.bo.PatientBO;

public interface IPatientDAO {

	public int registerPatientDetailsInDB(PatientBO bo) throws Exception;
}
