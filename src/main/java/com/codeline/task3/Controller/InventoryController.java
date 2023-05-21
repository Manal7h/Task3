package com.codeline.task3.Controller;

import com.codeline.task3.Request.InventoryRequest;
import com.codeline.task3.Request.OrderProductsRequest;
import com.codeline.task3.Response.CustomerResponse;
import com.codeline.task3.Response.InventoryResponse;
import com.codeline.task3.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(value = "inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @RequestMapping(value = "/createInventory" , method = RequestMethod.POST)
    public String createInventory(@RequestBody InventoryRequest request){
        try {
            inventoryService.createInventory(request);
        } catch (Exception e) {
            return "Failed create";
        }
        return "create Successfully";
    }


    @RequestMapping(value = "/getAllInventory" , method = RequestMethod.GET)
    public List<InventoryResponse> getAllInventory() {
        List<InventoryResponse> inventory = inventoryService.getAllInventory();
        return inventory;
    }

    @RequestMapping(value = "/getInventoryById" , method = RequestMethod.GET)
    public InventoryResponse getInventoryById(@RequestParam Integer inventoryId) {
        InventoryResponse inventoryResponse = inventoryService.getInventoryById(inventoryId);
        return inventoryResponse;
    }

    @RequestMapping(value = "/deleteInventoryById", method = RequestMethod.GET)
    public String deleteInventoryById(InventoryRequest inventoryRequest){
        try {
            inventoryService.deleteInventoryById(inventoryRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }
}
