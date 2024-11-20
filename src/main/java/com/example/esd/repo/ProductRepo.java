package com.example.esd.repo;

import com.example.esd.entity.Customer;
import com.example.esd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM product WHERE price BETWEEN 15 AND 30 ORDER BY price DESC LIMIT 2", nativeQuery = true)
    List<Product> findTop2Products();
}
