package com.example.esd.service;

import com.example.esd.dto.CustomerRequest;
import com.example.esd.entity.Customer;
import com.example.esd.mapper.CustomerMapper;
import com.example.esd.repo.CustomerRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo repo;
    private final CustomerMapper mapper;

    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }

    public String login(String email, String password) {
        Optional<Customer> customer = repo.findByEmail(email);
        if (customer.isPresent() && customer.get().getPassword().equals(password)) {
            return "User logged in successfully";
        }
        return "Invalid email or password";
    }
}
