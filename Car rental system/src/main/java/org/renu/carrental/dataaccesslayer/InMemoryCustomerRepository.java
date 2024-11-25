package org.renu.carrental.dataaccesslayer;

import org.renu.carrental.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer){
        customerList.add(customer);
        System.out.println("customer added" + customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Optional<Customer> existingCustomer = getCustomerByEmail(customer.getEmail());
        existingCustomer.ifPresent(c -> {
            c.setName(customer.getName());
            c.setPhoneNumber(customer.getPhoneNumber());
        });
         }

    @Override
    public void deleteCustomer(String email) {
        customerList.removeIf(customer -> customer.getEmail().equals(email));
    }

    @Override
    public Optional<Customer> getCustomerByEmail(String email) {
        return customerList.stream()
                .filter(customer -> customer.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerList);
    }
}
