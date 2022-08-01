package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.servise.ICustomerService;
import com.nt.vo.CustomerVo;

public class MainController {
	
	private ICustomerService ser;

	public MainController(ICustomerService ser) {
		System.out.println("MainController.::1 param constructor");
		this.ser = ser;
	}
	
	public String processCustomer(CustomerVo vo) throws Exception{
		
		CustomerDTO dto=new CustomerDTO();
		if(vo!=null) {
		dto.setCname(vo.getCname());
		dto.setCaddre(vo.getCaddre());
		dto.setPamt(Double.parseDouble(vo.getPamt()));
		dto.setRoInterest(Double.parseDouble(vo.getRoInterest()));  
		dto.setIntamt(Double.parseDouble(vo.getIntAmt()));
		dto.setTimePeriod(Double.parseDouble(vo.getTimePeriod()));
		}
		String msg=ser.registerCustomer(dto);
		System.out.println("controller class method completed");
		return msg;
	}
	
	
}
