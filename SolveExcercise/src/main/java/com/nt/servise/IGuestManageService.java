package com.nt.servise;

import com.nt.dto.GuestDTO;

public interface IGuestManageService {
	
	public String registerGuest(GuestDTO dto) throws Exception;
}
