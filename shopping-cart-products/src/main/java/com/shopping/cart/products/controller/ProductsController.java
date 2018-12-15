package com.shopping.cart.products.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductsController {

	@Value("${product.service.application.name}")
	private String appName;
	
	@Value("${product.service.database.name:Default Database}")
	private String databaseName;
	
	@GetMapping("/environment")
	public String getEnvironmentDetails() {
		return appName + databaseName;
	}
	
}
