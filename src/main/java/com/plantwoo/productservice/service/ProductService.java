package com.plantwoo.productservice.service;

import com.plantwoo.productservice.model.Product;
import com.plantwoo.productservice.repository.ReactiveProductRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    ReactiveProductRepository productRepository;

    public Mono<Product> insertUpdate(Product product) {
       return productRepository.save(product);
    }

    public Mono<Void> delete(ObjectId productId) {
        return productRepository.deleteById(productId);
    }

    public Mono<Product> getOrder(ObjectId productId) {
        return productRepository.findById(productId);
    }

    public Flux<Product> getProducts() {
        return productRepository.findAll();
    }
}
