package com.nt.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

@Service("patientService")
public class PatientManageServiceImpl implements IPatientManagServices {
	@Autowired
	
	private IPatientDAO dao;
	
	

	public PatientManageServiceImpl(IPatientDAO dao) {
		System.out.println("PatientManageServiceImpl::1 param constructor");
		this.dao = dao;
	}



	@Override
	public String registerPatient(PatientDTO patdto) throws Exception {
		
		System.out.println("PatientManageServiceImpl class::registerPatient() method");
		double totalamt=patdto.getNoOfDayAdmit()*patdto.getPerDayCharge();
			
		PatientBO patbo=new PatientBO();
		patbo.setPname(patdto.getPname());
		patbo.setPaddress(patdto.getPaddress());
		patbo.setPerDayCharge(patdto.getPerDayCharge());
		patbo.setNoOfDayAdmit(patdto.getNoOfDayAdmit());
		patbo.setTotalBillAmt(totalamt);
		
		int count=dao.insertPatientRecord(patbo);
		
		return count==0?"Registration failed":"Registartion sucessful with id is"+count;
	}

}
