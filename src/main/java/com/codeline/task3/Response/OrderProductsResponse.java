package com.codeline.task3.Response;

import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Model.OrderProducts;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
public class OrderProductsResponse {


    Integer quanti;
    String shippingA;
    Integer reorderT;
    Integer cId;

    public static OrderProductsResponse convertToResponse(OrderProducts request) {
        return OrderProductsResponse.builder()
                .quanti(request.getQuantity())
                .shippingA(request.getShippingAddress())
                .reorderT(request.getReorderThreshold())
                .cId(request.getQuantity())
                .build();
    }

    public static List<OrderProductsResponse> convertToResponseList(List<OrderProducts> request) {
        List<OrderProductsResponse> orderProductsResponseList = new ArrayList<>();
        for (OrderProducts OrderProductsRequest : request) {
            orderProductsResponseList.add(convertToResponse(OrderProductsRequest));
        }
        return orderProductsResponseList;
    }
}



