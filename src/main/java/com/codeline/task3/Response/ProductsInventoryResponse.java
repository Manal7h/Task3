package com.codeline.task3.Response;

import com.codeline.task3.Model.Product;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class ProductsInventoryResponse {
    String pName;
    Integer quantityA;

    public static ProductsInventoryResponse convertToResponse(Product request) {
        return ProductsInventoryResponse.builder()
                .pName(request.getProductName())
                .quantityA(request.getQuantityAvailable())
                .build();
    }

}
