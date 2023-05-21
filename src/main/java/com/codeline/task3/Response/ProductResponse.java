package com.codeline.task3.Response;

import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Model.Product;
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
public class ProductResponse {

    String pName;
    Double pri;
    Integer quantityA;

    Integer oPId;
    Integer iId;

    public static ProductResponse convertToResponse(Product request) {
        return ProductResponse.builder()
                .pName(request.getProductName())
                .pri(request.getPrice())
                .quantityA(request.getQuantityAvailable())
                .oPId(request.getOrderProducts().getOrderProductsId())
                .iId(request.getInventory().getInventoryId())
                .build();
    }

    public static List<ProductResponse> convertToResponseList(List<Product> request) {
        List<ProductResponse> productResponseList = new ArrayList<>();
        for (Product productResponseRequest : request) {
            productResponseList.add(convertToResponse(productResponseRequest));
        }
        return productResponseList;
    }

}
