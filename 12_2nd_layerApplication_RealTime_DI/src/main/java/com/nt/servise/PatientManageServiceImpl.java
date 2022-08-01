package com.nt.servise;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

public class PatientManageServiceImpl implements IPatientManagServices {
	
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
