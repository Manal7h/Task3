package com.codeline.task3.Service;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Repository.CustomerRepository;
import com.codeline.task3.Repository.OrderProductsRepository;
import com.codeline.task3.Request.OrderProductsRequest;
import com.codeline.task3.Response.OrderProductsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class OrderProductsService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderProductsRepository orderProductsRepository;


    public String createOrderProducts(OrderProductsRequest request) {
        OrderProducts orderProducts = new OrderProducts();
        orderProducts.setQuantity(request.getQuantity());
        orderProducts.setShippingAddress(request.getShippingAddress());
        orderProducts.setReorderThreshold(request.getReorderThreshold());
        Customer customer = customerRepository.findById(request.getCustomerId()).get();
        orderProducts.setCustomer(customer);
        orderProducts.setIsActive(true);
        orderProducts.setCreatedDate(new Date());
        orderProductsRepository.save(orderProducts);
        return "Order Created Successfully";
    }

    public List<OrderProductsResponse> getAllOrderProducts() {
        return OrderProductsResponse.convertToResponseList(orderProductsRepository.getAllOrderProducts());
    }

    public OrderProductsResponse getOrderProductsById(Integer orderProductsId) {
        OrderProducts orderProducts = orderProductsRepository.findById(orderProductsId).get();
        OrderProductsResponse orderProductsResponse = OrderProductsResponse.convertToResponse(orderProducts);
        return orderProductsResponse;
    }


    public void deleteOrderProductsById(OrderProductsRequest request) {
        Customer customer = customerRepository.findById(request.getCustomerId()).get();
        OrderProducts orderProducts = orderProductsRepository.findById(request.getOrderProductsId()).get();
        orderProducts.setIsActive(false);
        orderProducts.setUpdatedDate(new Date());
        orderProductsRepository.save(orderProducts);
    }
}