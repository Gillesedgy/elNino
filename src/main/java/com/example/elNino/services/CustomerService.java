package com.example.elNino.services;

import com.example.elNino.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements CustomerServiceImplementation {
    @Autowired
    private CustomerRepository customerRepository;
}
