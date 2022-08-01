package com.nt.sbeans;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@PropertySource(value="com/nt/commons/cardInfo.properties")
@Component
public class PaymentMode implements ApplicationContextAware{
	@Value("${card.cardNo}")
	private String cardNo;
	@Value("${card.gateWayName}")
	private String gateWayName;
	
	private ApplicationContext applicationContext;

	public PaymentMode() {
		System.out.println("PaymentMode class is executed");
	}
	
	public String cashPayment() {
		return "payMent done in Cash with and total amount paid is::"+new Random().nextInt(5000);
	}
	
	public String shoppingInMall() {
	
		CreaditCard cc=applicationContext.getBean(CreaditCard.class);
		String msg=cc.shoppingUsingCreditCard();
		return msg+" \ncard GateWay is::"+gateWayName +" and "
				+ "\ncard no is::"+cardNo;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
		
	}
}
