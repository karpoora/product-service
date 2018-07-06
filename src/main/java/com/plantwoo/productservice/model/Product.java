package com.plantwoo.productservice.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {
    @Id
    private ObjectId _id;
    private String name;
    private String description;
    private String price;
}
