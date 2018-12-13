package com.shopping.cart.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingCartZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartZuulApplication.class, args);
	}

}

