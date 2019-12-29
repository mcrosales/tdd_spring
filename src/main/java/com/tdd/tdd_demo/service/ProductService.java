package com.tdd.tdd_demo.service;


import com.tdd.tdd_demo.model.Product;
import com.tdd.tdd_demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        //Run validations

        //Save product
        return productRepository.save(product);
    }

    public boolean deleteProduct(Integer productId) {
        return productRepository.deleteProductById(productId);
    }

    public Product findProduct(Integer id) {
        return productRepository.findFirstById(id);
    }

    public List<Product> retrieveAllProducts() {
        return productRepository.findAllBy();
    }
}
