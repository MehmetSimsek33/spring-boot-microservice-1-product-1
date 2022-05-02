package com.sh.springbootmicroservice1product.controller.service;

import com.sh.springbootmicroservice1product.model.Product;
import com.sh.springbootmicroservice1product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductManager implements  IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product saveProduct(Product product)
    {
        product.setCreateTime(LocalDateTime.now());
        return  productRepository.save(product);
    }
    @Override
    public  void deleteById(Long id)
    {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return productRepository.findAll();
    }
}
