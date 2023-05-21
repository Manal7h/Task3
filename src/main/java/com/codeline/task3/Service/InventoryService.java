package com.codeline.task3.Service;
import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Request.InventoryRequest;
import com.codeline.task3.Response.CustomerResponse;
import com.codeline.task3.Response.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;


@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public String createInventory(InventoryRequest request) {
        Inventory inventory = new Inventory();
        inventory.setInventoryLocation(request.getInventoryLocation());
        inventory.setIsActive(true);
        inventory.setCreatedDate(new Date());
        inventoryRepository.save(inventory);
        return "Inventory Created Successfully";
    }

    public List<InventoryResponse> getAllInventory() {
        return InventoryResponse.convertToResponseList(inventoryRepository.getAllInventory());
    }

    public InventoryResponse getInventoryById(Integer inventoryId) {
        Inventory inventory = inventoryRepository.findById(inventoryId).get();
        InventoryResponse inventoryResponse = InventoryResponse.convertToResponse(inventory);
        return inventoryResponse;
    }
}
