package com.codeline.task3.Response;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Inventory;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class InventoryResponse {

    Integer iId;

    String iLocation;

    public static InventoryResponse convertToResponse(Inventory request) {
        return InventoryResponse.builder()
                .iLocation(request.getInventoryLocation())
                .build();
    }
}
