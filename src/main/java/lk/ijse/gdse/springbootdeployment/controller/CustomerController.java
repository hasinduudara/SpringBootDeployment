package lk.ijse.gdse.springbootdeployment.controller;

import lk.ijse.gdse.springbootdeployment.entity.Customer;
import lk.ijse.gdse.springbootdeployment.service.CustomerServive;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerServive customerServive;

    @GetMapping
    public String getCustomers() {
        return "Customer 1";
    }

    @PostMapping("/create")
    public ResponseEntity<Customer>
    createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(
                customerServive.createCustomer(customer));
    }
}
