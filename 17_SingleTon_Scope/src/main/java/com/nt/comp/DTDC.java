package com.nt.comp;

import java.util.Random;

public class DTDC implements ICourier {

	
	public DTDC() {
		System.out.println("DTDC class ::0 param constructor");
	}

	@Override
	public String txId(String name) {
		int txid=new Random().nextInt(10000);
		
		return name+" your transaction id is "+ txid +" and your courier is send through DTDC";
	}

}
