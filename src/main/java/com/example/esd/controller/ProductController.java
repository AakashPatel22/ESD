package com.example.esd.controller;

import com.example.esd.dto.ProductRequest;
import com.example.esd.entity.Product;
import com.example.esd.helper.AuthHelper;
import com.example.esd.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;
    private final AuthHelper authHelper;
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest.ProductRequestBody productCreateRequest) {
        return ResponseEntity.ok(productService.createProduct(productCreateRequest));
    }
}