package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.PatientDTO;
import com.nt.service.IPatientService;
import com.nt.vo.PatientVO;

@Component("controllerbeanclass")
public class MainController {

	@Autowired
	private IPatientService service;

	public MainController(IPatientService service) {
		System.out.println("Main Controller class:: service ref variable is initailize");
		this.service = service;
	}
	
	public String processPatient(PatientVO vo) throws Exception{
		
		PatientDTO dto=new PatientDTO();
		dto.setPname(vo.getPname());
		dto.setPadd(vo.getPadd());
		dto.setPerDayCharge(Double.parseDouble(vo.getPdayCharge()));
		dto.setNoOfDayAdmit(Integer.parseInt(vo.getNoOfDayAdmit()));
		
		String msg=service.prepareBill(dto);
		return msg;
	}
}
