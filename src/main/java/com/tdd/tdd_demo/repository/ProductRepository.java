package com.tdd.tdd_demo.repository;

import com.tdd.tdd_demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    boolean deleteProductById(Integer productId);

    Page<Product> findBy(Pageable pageable);

    List<Product> findAllBy();

    Product findFirstById(Integer id);
}
