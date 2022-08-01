package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@PropertySource(value="com/nt/commons/cardInfo.properties")
@Component
public class PaymentMode {
	@Value("${card.cardNo}")
	private String cardNo;
	@Value("${card.gateWayName}")
	private String gateWayName;

	public PaymentMode() {
		System.out.println("PaymentMode class is executed");
	}
	
	public String cashPayment() {
		return "payMent done in Cash with and total amount paid is::"+new Random().nextInt(5000);
	}
	
	public String shoppingInMall() {
		ClassPathXmlApplicationContext cpac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		CreaditCard cc=cpac.getBean(CreaditCard.class);
		String msg=cc.shoppingUsingCreditCard();
		return msg+" \ncard GateWay is::"+gateWayName +" and "
				+ "\ncard no is::"+cardNo;
	}
}
