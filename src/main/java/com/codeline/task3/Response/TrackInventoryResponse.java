package com.codeline.task3.Response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
public class TrackInventoryResponse {

    String iLocation;
    Integer quantityA;

    List<ProductsInventoryResponse> productsInventoryResponseList;


}
