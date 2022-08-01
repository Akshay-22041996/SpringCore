package com.nt.dao;

import com.nt.bo.CustomerBo;

public interface ICustomerDAO {
	
	public int savedCustomer(CustomerBo bo) throws Exception;
}
