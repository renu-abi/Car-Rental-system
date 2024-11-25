package org.renu.carrental.service;

import org.renu.carrental.dataaccesslayer.CustomerRepository;
import org.renu.carrental.model.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public void addCustomer(Customer customer){
        customerRepository.addCustomer(customer);
    }
    public void updateCustomer(Customer customer){
        customerRepository.updateCustomer(customer);
    }
    public void deleteCustomer(String email){
        customerRepository.deleteCustomer(email);
    }
    public Optional<Customer> getCustomerByEmail(String email){
        return customerRepository.getCustomerByEmail(email);
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.getAllCustomers();
    }

}
