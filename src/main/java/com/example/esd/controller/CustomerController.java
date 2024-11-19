package com.example.esd.controller;

import com.example.esd.dto.CustomerRequest;
import com.example.esd.entity.Customer;

import com.example.esd.service.CustomerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;


    @PostMapping("/register")
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerRequest.CustomerCreateRequest customerCreateRequest) {
        return ResponseEntity.ok(customerService.createCustomer(customerCreateRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginCustomer(@RequestBody @Valid CustomerRequest.CustomerLoginRequest customerLoginRequest) {
        return ResponseEntity.ok(customerService.loginCustomer(customerLoginRequest));
    }


}
