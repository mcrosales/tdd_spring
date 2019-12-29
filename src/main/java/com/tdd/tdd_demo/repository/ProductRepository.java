package com.tdd.tdd_demo.repository;

import com.tdd.tdd_demo.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Integer> {
}
