package com.codeline.task3.Controller;

import com.codeline.task3.Request.InventoryRequest;
import com.codeline.task3.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

//    @RequestMapping(value = "/createInventory" , method = RequestMethod.POST)
//    public String createInventory(@RequestBody InventoryRequest request){
//        try {
//            inventoryService.createInventory(request);
//        } catch (Exception e) {
//            return "Failed Delete";
//        }
//        return "Delete Successfully";
//    }
}
