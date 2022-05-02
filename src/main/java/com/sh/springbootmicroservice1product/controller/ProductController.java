package com.sh.springbootmicroservice1product.controller;

import com.sh.springbootmicroservice1product.model.Product;
import com.sh.springbootmicroservice1product.controller.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

   @Autowired
   private IProductService productService;

   @PostMapping
   public ResponseEntity<?> saveProduct(@RequestBody Product product)
   {
       return  new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
   }
   @DeleteMapping("{productId}")
   public  ResponseEntity<?> deleteProduct(@PathVariable Long productId){
      productService.deleteById(productId);
      return new  ResponseEntity<>(HttpStatus.OK);
   }
   @GetMapping
   public  ResponseEntity<?> getAllProducts()
   {
      return ResponseEntity.ok(productService.findAllProducts());
   }

}
