package com.example.Practical5.service;

import com.example.Practical5.model.Product;
import com.example.Practical5.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ResponseEntity getProducts() {
        var products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }

    public ResponseEntity addProduct(Product product) {
        var savedProduct = productRepository.save(product);
        return ResponseEntity.ok(savedProduct);
    }
}
