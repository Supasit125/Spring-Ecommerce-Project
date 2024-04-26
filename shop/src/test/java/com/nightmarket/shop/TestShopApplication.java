package com.nightmarket.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestShopApplication {

	public static void main(String[] args) {
		SpringApplication.from(ShopApplication::main).with(TestShopApplication.class).run(args);
	}

}
