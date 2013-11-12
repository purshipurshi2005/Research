package com.oracle.customer.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.oracle.customer.model.Customer;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO{
	
	//add the customer
	public void addCustomer(Customer customer){
		
		getHibernateTemplate().save(customer);
		
	}
	
	//return all the customers in list
	public List<Customer> listCustomer(){
		
		return getHibernateTemplate().find("from Customer");
		
	}
}