package com.codeline.task3.Service;
import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Repository.ProductRepository;
import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Request.InventoryRequest;
import com.codeline.task3.Request.OrderProductsRequest;
import com.codeline.task3.Response.CustomerResponse;
import com.codeline.task3.Response.InventoryResponse;
import com.codeline.task3.Response.ProductsInventoryResponse;
import com.codeline.task3.Response.TrackInventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;
    @Autowired
    ProductRepository productRepository;

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

    public void deleteInventoryById(InventoryRequest request) {
        Inventory inventory = inventoryRepository.findById(request.getInventoryId()).get();
        inventory.setIsActive(false);
        inventory.setUpdatedDate(new Date());
        inventoryRepository.save(inventory);
    }

    public List<TrackInventoryResponse> trackInventoryLevels() {
        List<TrackInventoryResponse> trackInventoryResponse = new ArrayList<>();
        List<Inventory> getAllInventory = inventoryRepository.getAllActiveInventory();


        for (Inventory inventory : getAllInventory) {
            List<Product> getAllProductsByInventoryId = productRepository.getAllProductsByInventoryId(inventory.getInventoryId());
            List<ProductsInventoryResponse> productsInventoryResponse = ProductsInventoryResponse.convertToResponseList(getAllProductsByInventoryId);
            TrackInventoryResponse inventoryResponse = new TrackInventoryResponse();
            inventoryResponse.setInventoryLocation(inventory.getInventoryLocation());
            inventoryResponse.setProductList(productsInventoryResponse);
            trackInventoryResponse.add(inventoryResponse);
        }
        return trackInventoryResponse;

    }
}
