package com.example.elNino.services.classes;

import com.example.elNino.repository.CustomerRepository;
import com.example.elNino.services.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements CustomerServiceImpl {
    @Autowired
    private CustomerRepository customerRepository;

}
