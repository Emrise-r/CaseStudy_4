package com.casestudy.repository;

import com.casestudy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Iterable<Product> findAllByProductName(Product product);

    Page<Product> findAllByProductNameContaining(Product product , Pageable pageable);
}
