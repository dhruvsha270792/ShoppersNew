package com.nexusdevs.shopper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.nexusdevs.shopper.db.MongoDBManager;

@SpringBootApplication
public class ShoppersDealApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppersDealApplication.class, args);
	}
	
	@Autowired
	private Environment env;
	
	@Bean
	public MongoDBManager mongoDBManager(){
		String host = env.getProperty("spring.data.mongodb.host");
		String db = env.getProperty("spring.data.mongodb.database");
		MongoDBManager mdb = new MongoDBManager(host, db);
		return mdb;
	}
}