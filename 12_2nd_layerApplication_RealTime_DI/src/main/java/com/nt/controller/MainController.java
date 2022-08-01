package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.servise.IPatientManagServices;
import com.nt.vo.PatientVo;

public class MainController {
	
	private IPatientManagServices service;

	public MainController(IPatientManagServices service) {
		System.out.println("MainController::1 param constructor");
		this.service = service;
	}
	
	public String processPatient(PatientVo patvo) throws Exception{
		
		PatientDTO patdto=new PatientDTO();
		patdto.setPname(patvo.getPname());
		patdto.setPaddress(patvo.getPaddress());
		patdto.setNoOfDayAdmit(Integer.parseInt(patvo.getNoOfDayAdmit()));
		patdto.setPerDayCharge(Double.parseDouble(patvo.getPerDayCharge()));
		//patdto.setTotalBillAmt(null);
		String resultmsg=service.registerPatient(patdto);
		return resultmsg;
	}
	
	
}
