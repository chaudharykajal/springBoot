package com.jpa.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Product;
import com.jpa.repository.ProductRepository;


@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	ProductRepository prodRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		prodRepo.save(new Product("Iphone 12", 45000.00,"blue"));
		prodRepo.save(new Product("Iphone 12", 45000.00,"black"));

		prodRepo.findAll().forEach(map->System.out.println(map.getpName()));
		
		Optional<Product> p=prodRepo.findById(101);
		if(p.isPresent()) {
			System.out.println(p.get().getpName());
		}
		else {
			System.out.println("Product Not Available");
		}
	}

}
