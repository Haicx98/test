package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getList(){
        return productRepository.findAll();
    }

    public Product getDetail(long proID){
        return productRepository.findById(proID).orElse(null);
    }

    public Product createProduct(Product product){
        product.setDateOfManf(Calendar.getInstance().getTimeInMillis());
        return productRepository.save(product);
    }

    public Product updateProduct(Product updatedProduct,long productID){
        Optional<Product> optionalProduct = productRepository.findById(productID);
        if(optionalProduct.isPresent()){
            Product existProduct = optionalProduct.get();
            existProduct.setDescription(updatedProduct.getDescription());
            existProduct.setPrice(updatedProduct.getPrice());
            existProduct.setProdName(updatedProduct.getProdName());
            return productRepository.save(existProduct);
        }
            return null;
    }
}
