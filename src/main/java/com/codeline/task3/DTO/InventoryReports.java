package com.codeline.task3.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class InventoryReports {

    Integer productId;
    String productName;
    Integer quantityAvailable;
    Integer reorderThreshold;

    public InventoryReports(Integer productId, String productName, Integer quantityAvailable, Integer reorderThreshold) {
        this.productId = productId;
        this.productName = productName;
        this.quantityAvailable = quantityAvailable;
        this.reorderThreshold = reorderThreshold;
    }
}
