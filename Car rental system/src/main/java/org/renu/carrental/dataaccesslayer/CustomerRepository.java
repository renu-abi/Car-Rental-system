package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(String email);
    Optional<Customer> getCustomerByEmail(String email);
    List<Customer> getAllCustomers();

}
