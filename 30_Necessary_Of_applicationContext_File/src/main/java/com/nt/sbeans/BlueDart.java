package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier {

	@Override
	public String courierDetails(int txid) {
		
		 return "Courier dispatched through BlueDart Courier with txid::"+txid;
	}

}
