package com.nt.servise;

import com.nt.dto.CustomerDTO;

public interface ICustomerService {

	public String registerCustomer(CustomerDTO custDTO) throws Exception;
}
