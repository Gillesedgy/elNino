package com.example.elNino.services.classes;

import com.example.elNino.dto.CustomerDto;
import com.example.elNino.dto.CustomerResponseDto;
import com.example.elNino.entities.Customer;
import com.example.elNino.repository.CustomerRepository;
import com.example.elNino.services.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceImpl {

    @Autowired
    private CustomerRepository customerRepository;

    public ResponseEntity<CustomerResponseDto> save(Customer customer) {
        CustomerResponseDto customerResponseDto = new CustomerResponseDto();
        customerResponseDto.setId(customer.getId());
        customerResponseDto.setFirstName(customer.getFirstName());
        customerResponseDto.setLastName(customer.getLastName());
        customerResponseDto.setEmail(customer.getEmail());
        customerRepository.save(customer);
        return ResponseEntity.ok(customerResponseDto);
    }
}