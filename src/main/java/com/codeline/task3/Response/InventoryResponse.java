package com.codeline.task3.Response;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Inventory;
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
public class InventoryResponse {


    String iLocation;

    public static InventoryResponse convertToResponse(Inventory request) {
        return InventoryResponse.builder()
                .iLocation(request.getInventoryLocation())
                .build();
    }

    public static List<InventoryResponse> convertToResponseList(List<Inventory> request) {
        List<InventoryResponse> inventoryResponseList = new ArrayList<>();
        for (Inventory inventoryRequest : request) {
            inventoryResponseList.add(convertToResponse(inventoryRequest));
        }
        return inventoryResponseList;
    }
}
