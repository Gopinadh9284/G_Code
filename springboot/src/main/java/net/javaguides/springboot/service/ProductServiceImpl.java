package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Product;
import net.javaguides.springboot.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository; 
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product= productRepository.findById(id).get();
		if(product!=null) {
			productRepository.delete(product);
			return "Product Delete";
		}
		return "Something went wrong";
	}

	@Override
	public Product editProduct(Product p, Integer id) {

		Product oldProduct = productRepository.findById(id).get();

		oldProduct.setProductName(p.getProductName());
		oldProduct.setDescription(p.getDescription());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());

		return productRepository.save(oldProduct);
	}

	

	
}
