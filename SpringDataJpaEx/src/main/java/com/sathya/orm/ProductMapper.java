package com.sathya.orm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
	
	//This method taking model class as input & return entity class as output
	 
	
	public Product modelToEntityConversion(ProductDetails productDetails) {
		
		
		// read the data from model class set to entity class
		
		Product product= new Product();
		product.setProId(productDetails.getProId());
		product.setProName(productDetails.getProName());
		product.setProPrice(productDetails.getProPrice());
		product.setCreateBy(System.getProperty("user.name"));
		product.setCreatAt(LocalDateTime.now());
		
		return product;
		
		
		
		
		
	}
	
	public List<Product> modelToEntityConversion1(List<ProductDetails>productDetails){
		List<Product> products=new ArrayList<Product>();
		//Reading the data from model class & setting the data to entity class
		for(ProductDetails proDetail:productDetails)
		{
			Product product= new Product();
			product.setProId(proDetail.getProId());
			product.setProName(proDetail.getProName());
			product.setProPrice(proDetail.getProPrice());
			product.setCreateBy(System.getProperty("user.name"));
			product.setCreatAt(LocalDateTime.now());
			products.add(product);
			
		}
		return products;
		
		
	}
	

}
