package com.codeline.task3.Response;

import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Repository.ProductRepository;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data

public class TrackInventoryResponse {


    String inventoryLocation;
    List<ProductsInventoryResponse> productList;


}
