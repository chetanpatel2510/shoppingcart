package com.shopping.cart.products.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.products.entity.ProductDetails;
import com.shopping.cart.products.repository.ProductRepository;

@RestController("/products")
@RefreshScope
public class ProductsController {

//	@Value("${product.service.application.name}")
	private String appName;
	
//	@Value("${product.service.database.name:Default Database}")
	private String databaseName;
	
//	@Value("${product.service.password}")
	private String password;
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/environment")
	public String getEnvironmentDetails() {
		return appName + databaseName + " - " + password;
	}
	
	@GetMapping("/getProductByCode/{code}")
	public ProductDetails getProductByCode(@PathVariable("code") String code) {
		 Optional<ProductDetails> productOption = productRepository.findById(code);
		 ProductDetails productDetails = null;
		 if (productOption.isPresent()) {
			 productDetails = productOption.get();
		 }
		 return productDetails;
	}
	
	@GetMapping("/getProductsByCategory/{categoryName}")
	public List<ProductDetails> getProductsByCategory(@PathVariable("categoryName") String category) {
		List<ProductDetails> productList = new ArrayList<>();
		ProductDetails productDetails = new ProductDetails();
		productDetails.setCategory(category);
		productDetails.setName("PROD_NAMe");
		productDetails.setCode("code1");
		productDetails.setDescription("description");
		productDetails.setPrice(BigDecimal.valueOf(100));
		productList.add(productDetails);
		return productList;
	}
	
	@GetMapping("/addProduct")
	public void addProduct() {
		ProductDetails productDetails = new ProductDetails();
		productDetails.setCategory("Clothes");
		productDetails.setName("PROD_NAMe1");
		productDetails.setCode("code1");
		productDetails.setDescription("description");
		productDetails.setPrice(BigDecimal.valueOf(100));
		productRepository.save(productDetails);
		
	}
	
	@GetMapping("/deleteProductByCode/{code}")
	public void deleteProduct(@PathVariable("code") String code) {
		productRepository.deleteById(code);
	}
	
}
