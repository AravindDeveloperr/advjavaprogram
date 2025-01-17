
package com.sathya.orm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

@Component
public class ProductClient implements CommandLineRunner{

	@Autowired
	ProductRepsitory productRepsitory ;
	
	@Autowired
	ProductMapper mapper;
	
	
	@Override
	public void run(String... args) throws Exception {

		//model class data: having the values
		ProductDetails productDetails = new ProductDetails();
		productDetails.setProId(1001);
		productDetails.setProName("Apple");
		productDetails.setProPrice(89);
		
		//conversion of model class data to entity
		
		Product product = mapper.modelToEntityConversion(productDetails);
		
		
		productRepsitory.save(product);
		//save method to add sigle product details
		
		productRepsitory.save(product);
		ProductDetails p1 =new ProductDetails();
		p1.setProId(111);
		p1.setProName("sugar");
		p1.setProPrice(20);
		
		ProductDetails p2=new ProductDetails();
		p2.setProId(222);
		p2.setProName("salt");
		p2.setProPrice(120);
		
		List<ProductDetails> proDetails =List.of(p1,p2);
		//conversionProcess
		
	List<Product>products =mapper.modelToEntityConversion1(proDetails);
	productRepsitory.saveAll(products);
	
	//findby id used to find the specific product
	
	  
	  
	  Optional<Product> p= productRepsitory.findById(222);
	  System.out.println(p);
	  List<Product>pro=productRepsitory.findAll();
	  for(Product product2:pro) {
		  System.out.println(product2);
	  }
	  System.out.println(productRepsitory.existsById(111));
	  System.out.println(productRepsitory.count());
	  productRepsitory.deleteById(222);
	  productRepsitory.deleteAll();

	}

}

