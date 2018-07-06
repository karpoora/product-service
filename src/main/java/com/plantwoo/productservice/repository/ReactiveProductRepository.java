package com.plantwoo.productservice.repository;

import com.plantwoo.productservice.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ReactiveProductRepository extends ReactiveMongoRepository<Product, ObjectId> {
    Mono<Product> findById(ObjectId id);
}
