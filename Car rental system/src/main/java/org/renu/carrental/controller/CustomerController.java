package org.renu.carrental.controller;

import org.renu.carrental.model.Customer;
import org.renu.carrental.service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }
    public void addCustomer(Customer customer){
        customerService.addCustomer(customer);
    }
    public void updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
    }
    public void  deleteCustomer(String email){
        customerService.deleteCustomer(email);
    }
    public Optional<Customer> getCustomerByEmail(String email){
        return customerService.getCustomerByEmail(email);
    }
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
