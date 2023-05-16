package com.codeline.task3.Service;

import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Model.Order;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Repository.OrderRepository;
import com.codeline.task3.Repository.ProductRepository;
import com.codeline.task3.Request.InventoryRequest;
import com.codeline.task3.Request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class InventoryService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    InventoryRepository inventoryRepository;

//    public String createInventory(InventoryRequest request) {
//        Inventory inventory = new Inventory();
//
//        Product product = productRepository.findById(request.getProductId()).get();
//        inventory.setProduct(product);
//        Order order = orderRepository.findById(request.getOrderId()).get();
//        inventory.setOrder(order);
//
//        inventory.setIsActive(true);
//        inventory.setCreatedDate(new Date());
//        inventoryRepository.save(inventory);
//        return "Inventory Created Successfully";
//    }
}
