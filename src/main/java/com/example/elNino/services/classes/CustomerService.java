package com.example.elNino.services.classes;

import com.example.elNino.dto.CustomerDto;
import com.example.elNino.entities.Customer;
import com.example.elNino.repository.CustomerRepository;
import com.example.elNino.services.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceImpl {

     @Autowired
     private CustomerRepository customerRepository;

      public Customer createCustomer(CustomerDto customerDto) {
          Customer customer = new Customer();
          customer.setFirstName(customerDto.getFirstName());
          customer.setLastName(customerDto.getLastName());
          customer.setEmail(customerDto.getEmail());
          return customerRepository.save(customer);
      }

}
