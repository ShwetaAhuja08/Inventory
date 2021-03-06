package com.cg.inventory.services;

import java.util.List;

import com.cg.inventory.model.Customer;

/**
 * This is an interface for CustomerService class, it has all the abstract methods
 * 
 * @author sarath lekha
 *
 */
public interface CustomerService {

	/**
	 * This method returns list of all Customers
	 * 
	 * @return list of Customers
	 */
	List<Customer> viewAllCustomers();

	/**
	 * This method takes Customer details and creates a new Customer
	 * 
	 * @param customer
	 * @return Customer entity details
	 */
	Customer createCustomer(Customer customer);

	/**
	 * This method takes Customer Id and deletes the Customer
	 * 
	 * @param customerId
	 */
	void removeCustomer(Long customerId);

	/**
	 * This method returns Customers by searching with specific Customer Id
	 * 
	 * @param customerId
	 * @return Customer details if found or else throw exception
	 */
	Customer viewCustomerById(Long customerId);

	/**
	 * This method updates Customer details by searching with Customer Id
	 * 
	 * @param customerId
	 * @param Customer
	 * @return Customer details if found or else throw exception
	 */
	Customer updateCustomer(Long customerId, Customer customer);

}