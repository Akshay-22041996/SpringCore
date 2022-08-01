package com.nt.service;

import com.nt.dto.PatientDTO;

public interface IPatientService {

	public String prepareBill(PatientDTO dto) throws Exception;
}
