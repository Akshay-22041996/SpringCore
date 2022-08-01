package com.nt.servise;

import com.nt.bo.GuestBO;
import com.nt.dao.IGuestDAO;
import com.nt.dto.GuestDTO;

public class GuestServiceImpl implements IGuestManageService {
	
	private IGuestDAO dao;

	public GuestServiceImpl(IGuestDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String registerGuest(GuestDTO dto) throws Exception {
	
		System.out.println("Service class method execution");
		
		double totalamt=dto.getNoOfDayStays()*dto.getPerDayCharge();
		
		GuestBO bo=new GuestBO();
		bo.setGuestName(dto.getGuestName());
		bo.setGuestAddress(dto.getGuestAddress());
		bo.setTotalBillAmt(totalamt);
		bo.setNoOfDayStays(dto.getNoOfDayStays());
		bo.setPerDayCharge(dto.getPerDayCharge());
		
		int count=dao.savedGuestDetails(bo);
		return count==0?"Registration failed":"Registration sucessful";
	}

}
