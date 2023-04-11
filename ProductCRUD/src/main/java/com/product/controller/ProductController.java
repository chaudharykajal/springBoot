package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.services.ProductServices;

@RestController
public class ProductController {
	@Autowired
	ProductServices ProdService;
	@GetMapping("/products")
	public List getProducts()
	{
		return ProdService.getProducts();
	}
	
	@PostMapping("/add")
	
	public Product addProducts(@RequestBody Product product) {
		return ProdService.addProducts(product);
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateProducts(@PathVariable Integer id, @RequestBody Product product)
	{
		return ProdService.updateProducts(id,product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		ProdService.delete(id);
	}
}

