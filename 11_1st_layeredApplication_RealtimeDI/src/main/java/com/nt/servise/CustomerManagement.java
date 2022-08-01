package com.nt.servise;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerManagement implements ICustomerService {
	
	private ICustomerDAO custdao;
	

	public CustomerManagement(ICustomerDAO custdao) {
		System.out.println("CustomerManagement.::1 param constructor");
		this.custdao = custdao;
	}


	@Override
	public String registerCustomer(CustomerDTO custDTO) throws Exception {
		
		
		double intamt=(custDTO.getPamt()*custDTO.getTimePeriod()*custDTO.getRoInterest())/100;
		
		CustomerBo bo=new CustomerBo();
		bo.setCname(custDTO.getCname());
		bo.setCaddre(custDTO.getCaddre());
		
		bo.setPamt(custDTO.getPamt());
		bo.setInterestAmt(intamt);
		
		int count=custdao.savedCustomer(bo);
		System.out.println("service class method complete");
		return count==0?"Registration Failed":"Registration Sucessful and interest amt is::"+intamt;
	}

}
