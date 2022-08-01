package com.nt.controller;

import com.nt.dto.GuestDTO;
import com.nt.servise.IGuestManageService;
import com.nt.vo.GuestVO;

public class MainController {
	
	private IGuestManageService service;

	public MainController(IGuestManageService service) {
		System.out.println("MainController::1 param constructor");
		this.service = service;
	}
	
	public String processGuest(GuestVO vo) throws Exception{
		
		
		GuestDTO dto=new GuestDTO();
		dto.setGuestName(vo.getGuestName());
		dto.setGuestAddress(vo.getGuestAddress());
		dto.setNoOfDayStays(Integer.parseInt(vo.getNoOfDayStays()));
		dto.setPerDayCharge(Double.parseDouble(vo.getPerDayCharge()));
		
		String msg=service.registerGuest(dto);
		return msg;
	}
	
}
