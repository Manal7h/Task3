package com.codeline.task3.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class InventoryReports {
String inventoryLocation;
    String productName;
    Integer quantityAvailable;
    Integer reorderThreshold;

//    public InventoryReports(String inventoryLocation, String productName, Integer quantityAvailable, Integer reorderThreshold) {
//        this.inventoryLocation = inventoryLocation;
//        this.productName = productName;
//        this.quantityAvailable = quantityAvailable;
//        this.reorderThreshold = reorderThreshold;
//    }
}
