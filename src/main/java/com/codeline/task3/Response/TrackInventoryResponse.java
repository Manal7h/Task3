package com.codeline.task3.Response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data

public class TrackInventoryResponse {


    String inventoryLocation;
    List<ProductsInventoryResponse> productList;


}
