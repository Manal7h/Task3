package com.codeline.task3.Service;
import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Request.InventoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public String createInventory(InventoryRequest request) {
        Inventory inventory = new Inventory();
        inventory.setIsActive(true);
        inventory.setCreatedDate(new Date());
        inventoryRepository.save(inventory);
        return "Inventory Created Successfully";
    }
}
