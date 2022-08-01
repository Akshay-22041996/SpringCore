package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public String courierDetails(int txid) {
		
		return "Courier dispatched through DTDC Courier with txid::"+txid;
	}

}
