package com.oracle.customer.dao;

import java.util.List;

import com.oracle.customer.model.Customer;

public interface CustomerDAO {
	
	void addCustomer(Customer customer);
	List<Customer> listCustomer();	

}
