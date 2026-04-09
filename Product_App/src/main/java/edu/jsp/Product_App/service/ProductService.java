package edu.jsp.Product_App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Product_App.entity.Product;
import edu.jsp.Product_App.respository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	
	public Product addproduct(Product p) {
		return repo.save(p);
	}
	

}
