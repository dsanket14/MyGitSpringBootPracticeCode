package com.redis.repo;

import com.redis.dto.ProductDto;
import com.redis.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    ProductDto findByName(String name);
}
