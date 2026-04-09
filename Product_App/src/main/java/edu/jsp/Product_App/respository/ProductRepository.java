package edu.jsp.Product_App.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.Product_App.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	//These are In-bulit Method in JpaRspository
        //	save(product e);
       //	findById(Integer id);
      //    findAll();
     //	    delete(Product e);
    //	    deleteById(Integer id)

}
