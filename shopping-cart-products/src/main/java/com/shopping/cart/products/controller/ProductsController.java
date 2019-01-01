package com.shopping.cart.products.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.products.entity.ProductDetails;

@RestController("/products")
@RefreshScope
public class ProductsController {

	@Value("${product.service.application.name}")
	private String appName;
	
	@Value("${product.service.database.name:Default Database}")
	private String databaseName;
	
	@Value("${product.service.password}")
	private String password;
	
	@GetMapping("/environment")
	public String getEnvironmentDetails() {
		return appName + databaseName + " - " + password;
	}
	
	@GetMapping("/getProductsByCategory/{categoryName}")
	public List<ProductDetails> getProductsByCategory(@PathVariable("categoryName") String category) {
		List<ProductDetails> productList = new ArrayList<>();
		ProductDetails productDetails = new ProductDetails();
		productDetails.setCategory(category);
		productDetails.setName("PROD_NAMe");
		productDetails.setDescription("description");
		productDetails.setPrice(BigDecimal.valueOf(100));
		productList.add(productDetails);
		return productList;
	}
	
}
