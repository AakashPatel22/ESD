package com.example.esd.repo;

import com.example.esd.entity.Customer;
import com.example.esd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface ProductRepo extends JpaRepository<Product, Long> {
}
