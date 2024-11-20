package com.example.esd.service;

import com.example.esd.dto.ProductRequest;
import com.example.esd.entity.Product;
import com.example.esd.mapper.ProductMapper;
import com.example.esd.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo repo;
    private final ProductMapper mapper;
    public Product createProduct(ProductRequest.ProductRequestBody request) {
        Product product = mapper.toEntity(request);
        product = repo.save(product);
        return product;
    }
}

