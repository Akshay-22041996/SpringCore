package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("fedX")
public class FedX implements Courier {

	@Override
	public String courierDetails(int txid) {
		
		return "Courier dispatched through FedX Courier with txid::"+txid;
	}

}
