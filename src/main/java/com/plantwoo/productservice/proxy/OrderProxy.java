package com.plantwoo.productservice.proxy;

import com.plantwoo.productservice.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

@FeignClient(name="order-service")
public interface OrderProxy {
    @PostMapping("/order")
    Mono<Order> create(@RequestBody Order order);
}