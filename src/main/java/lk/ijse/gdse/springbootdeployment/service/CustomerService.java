package lk.ijse.gdse.springbootdeployment.service;

import lk.ijse.gdse.springbootdeployment.entity.Customer;
import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
}