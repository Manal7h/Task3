package com.codeline.task3.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductRequest {

    Integer productId;
    String productName;
    Double price;
    Integer quantityAvailable;

    Integer orderProductsId;
    Integer inventoryId;





}
