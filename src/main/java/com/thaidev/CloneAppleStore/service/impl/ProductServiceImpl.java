package com.thaidev.CloneAppleStore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thaidev.CloneAppleStore.model.Product;
import com.thaidev.CloneAppleStore.repository.ProductRepository;
import com.thaidev.CloneAppleStore.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
	public List<Product> getAllProduct() {
        return productRepository.findAll();
    }//findAll

    @Override
	public void updateProduct(Product product) {
        productRepository.save(product);
    }//add or update (tuy vao pri-key)

    @Override
	public void removeProductById(long id) {
        productRepository.deleteById(id);
    }//delete dua vao pri-key

    @Override
	public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }//search theo id

    @Override
	public List<Product> getAllProductByCategoryId(int id) {
        return productRepository.findAllByCategory_Id(id);
    }
    //findList theo ProductDTO.categoryId

}
