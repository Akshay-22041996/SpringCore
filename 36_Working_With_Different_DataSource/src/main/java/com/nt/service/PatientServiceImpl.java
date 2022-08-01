package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

@Component("servicebeanclass")
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientDAO dao;

//	public PatientServiceImpl(IPatientDAO dao) {
//		System.out.println("PatientServiceImpl class :: dao constructor is initialize");
//		this.dao = dao;
//	}

	@Override
	public String prepareBill(PatientDTO dto) throws Exception {
		
		double billAmt=dto.getPerDayCharge()*dto.getNoOfDayAdmit();
		
		PatientBO bo=new PatientBO();
		bo.setPname(dto.getPname());
		bo.setPadd(dto.getPadd());
		bo.setPerDayCharge(dto.getPerDayCharge());
		bo.setNoOfDayAdmit(dto.getNoOfDayAdmit());
		bo.setTotalBill(billAmt);
		
		int count=dao.registerPatientDetailsInDB(bo);
		return count==0?"Bill prepartion is failed":"Bill is prepared ";
	}

}
