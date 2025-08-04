package lk.ijse.gdse.springbootdeployment.service.impl;

import lk.ijse.gdse.springbootdeployment.entity.Customer;
import lk.ijse.gdse.springbootdeployment.repository.CustomerRepository;
import lk.ijse.gdse.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}