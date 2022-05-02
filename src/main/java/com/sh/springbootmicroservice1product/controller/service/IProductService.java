package com.sh.springbootmicroservice1product.controller.service;

import com.sh.springbootmicroservice1product.model.Product;

import java.util.List;

public interface IProductService {
    public  void deleteById(Long id);
    public Product saveProduct(Product product);
    public List<Product> findAllProducts();


}
