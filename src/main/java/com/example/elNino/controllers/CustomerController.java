package com.example.elNino.controllers;

import com.example.elNino.dto.CustomerRequestDto;
import com.example.elNino.dto.CustomerResponseDto;
import com.example.elNino.entities.Customer;
import com.example.elNino.services.classes.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/register")
    public ResponseEntity<CustomerResponseDto> createCustomer( @RequestBody @Validated CustomerRequestDto customerRequestDto) {
        Customer customer = new Customer();
        customer.setFirstName(customerRequestDto.getFirstName());
        customer.setLastName(customerRequestDto.getLastName());
        customer.setEmail(customerRequestDto.getEmail());
        return customerService.save(customer);

    }




}

