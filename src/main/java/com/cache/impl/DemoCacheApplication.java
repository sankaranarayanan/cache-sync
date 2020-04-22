package com.cache.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableCaching
//@ImportResource("http-outbound-gateway.xml")
public class DemoCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCacheApplication.class, args);
	}

}
