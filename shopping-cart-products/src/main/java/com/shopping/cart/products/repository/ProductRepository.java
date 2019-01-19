package com.shopping.cart.products.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.shopping.cart.products.entity.ProductDetails;

@Repository
public interface ProductRepository extends CassandraRepository<ProductDetails, String> {
	
}
