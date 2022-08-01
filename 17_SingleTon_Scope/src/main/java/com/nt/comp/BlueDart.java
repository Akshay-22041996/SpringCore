package com.nt.comp;

import java.util.Random;

public class BlueDart implements ICourier{

	public BlueDart() {
		System.out.println("BlueDart class::0 param constructor ");
	}

	@Override
	public String txId(String name) {
		int txid=new Random().nextInt(10000);
		
		return name+" your transaction id is "+ txid +" and your courier is send through BlueDart";
	}

	
}
