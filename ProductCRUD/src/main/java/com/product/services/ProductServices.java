package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.product.model.Product;
import com.product.repository.ProductRepository;


@Service
public class ProductServices {
	
	@Autowired 
	ProductRepository ProdRepo;
	 public List<Product> getProducts(){
		 return ProdRepo.findAll();
	 }
	public Product addProducts(@RequestBody Product product) {
		// TODO Auto-generated method stub
		Product insertProd=ProdRepo.save(product);
		return insertProd;
	}
	public ResponseEntity<Product> updateProducts(@PathVariable Integer id,
			@RequestBody Product product)
	{
		Product getProd=ProdRepo.getById(id);
		getProd.setProductName(product.getProductName());
		getProd.setProductPrice(product.getProductPrice());
		getProd.setProductQty(product.getProductQty());
		
		Product updateProd=ProdRepo.save(getProd);
		return ResponseEntity.ok().body(updateProd);
	}
	
	public void delete(@PathVariable Integer id)
	{
		ProdRepo.deleteById(id);
	}
}
