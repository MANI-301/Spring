package edu.jsp.Product_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Product_App.entity.Product;
import edu.jsp.Product_App.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product p) {
		
		return service.addproduct(p);
	}
	
	

}
