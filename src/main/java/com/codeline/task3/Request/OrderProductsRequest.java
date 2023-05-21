package com.codeline.task3.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OrderProductsRequest {

    Integer orderProductsId;
    Integer quantity;
    String shippingAddress;
    Integer reorderThreshold;
    Integer customerId;


}
