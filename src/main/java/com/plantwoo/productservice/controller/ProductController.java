package com.plantwoo.productservice.controller;

import com.plantwoo.productservice.model.Product;
import com.plantwoo.productservice.service.ProductService;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    public static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @GetMapping("/test")
    public String getUserTest(){
        LOGGER.info("in productService Test API");
        return "success";
    }

    @PutMapping("/Product")
    Mono<Product> update(@RequestBody Product Product){
        return productService.insertUpdate(Product);
    }

    @DeleteMapping("/Product/{ProductId}")
    Mono<Void> delete(@PathVariable ObjectId ProductId){
        return productService.delete(ProductId);
    }

    @GetMapping("/Product/{ProductId}")
    Mono<Product> getOrder(@PathVariable ObjectId ProductId){
        return productService.getOrder(ProductId);
    }

    @GetMapping("/Products")
    Flux<Product> getProducts(){
        return productService.getProducts();
    }

}
