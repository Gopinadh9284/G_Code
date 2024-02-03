package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Product;
@Service
public interface ProductService {

	public Product saveProduct(Product product);
	
	public List<Product>getAllProduct();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);
	
	public Product  editProduct(Product product,Integer id);
}
