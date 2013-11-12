package com.oracle.customer.bo;

import java.util.List;

import com.oracle.customer.model.Customer;

public interface CustomerBo {
	
	void addCustomer(Customer customer);
	List<Customer> listCustomer();

}
