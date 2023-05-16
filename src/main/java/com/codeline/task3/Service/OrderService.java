package com.codeline.task3.Service;

import com.codeline.task3.Repository.OrderRepository;
import com.codeline.task3.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;
//    @Autowired
//    InventoryRepository inventoryRepository;

//    public String createOrder(OrderRequest request) {
//        Order order = new Order();
//        order.setQuantity(request.getQuantity());
//        order.setShippingAddress(request.getShippingAddress());
//
//        Product product = productRepository.findById(request.getProductId()).get();
//        order.setProduct(product);
////        Inventory inventory = inventoryRepository.findById(request.getInventoryId()).get();
////        order.setInventory(inventory);
//
//        order.setIsActive(true);
//        order.setCreatedDate(new Date());
//        orderRepository.save(order);
//        return "Order Created Successfully";
//    }
}
