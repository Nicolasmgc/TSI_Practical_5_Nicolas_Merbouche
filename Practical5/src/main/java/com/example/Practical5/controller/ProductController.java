package com.example.Practical5.controller;

import com.example.Practical5.model.Product;
import com.example.Practical5.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public ResponseEntity getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/product")
    public ResponseEntity saveProducts(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}
