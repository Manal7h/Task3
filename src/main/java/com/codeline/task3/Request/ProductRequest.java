package com.codeline.task3.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class ProductRequest {

    Integer productId;
    String productName;
    String price;
    Integer quantityAvailable;
    Integer ingredientId;
    Integer orderId;
    Integer inventoryId;






}
