package mikefallonit.workrecord.controllers;

import mikefallonit.workrecord.models.Customer;
import mikefallonit.workrecord.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;



    @GetMapping("id")
    public Optional<Customer> getCustomer(@PathVariable Long id){
        return customerRepository.findById(id);
    }
}
