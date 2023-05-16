package com.codeline.task3.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OrderRequest {

    Integer orderId;
    Integer quantity;
    Integer reorderThreshold;
    Integer customerId;


}
