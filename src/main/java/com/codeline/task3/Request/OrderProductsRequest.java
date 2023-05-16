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
    Integer reorderThreshold;
    Integer customerId;


}
