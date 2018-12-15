package com.shopping.cart.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class ShoppingCartProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartProductsApplication.class, args);
	}

}

