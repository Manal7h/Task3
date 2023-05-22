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


}
