package com.nt.dao;

import com.nt.bo.GuestBO;

public interface IGuestDAO {
	
	public int savedGuestDetails(GuestBO bo) throws Exception;
}
