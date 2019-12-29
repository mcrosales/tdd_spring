package com.tdd.tdd_demo.service;

import com.tdd.tdd_demo.model.Product;
import com.tdd.tdd_demo.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class ProductServiceTest {

    private ProductRepository productRepository = Mockito.mock(ProductRepository.class);

    private ProductService productService;

    @BeforeEach
    void setUp() {
        productService = new ProductService(productRepository);
    }

    @Test
    void savedProductIsValid() {
        Product product = new Product();
        product.setName("TV");
        Mockito.when(productRepository.save(Mockito.any(Product.class))).thenReturn(product);
        Product savedProduct = productService.saveProduct(product);

        assertTrue(savedProduct.getName().equalsIgnoreCase(product.getName()),"Names must match");
    }
}