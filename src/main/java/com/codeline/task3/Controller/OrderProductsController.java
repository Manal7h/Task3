package com.codeline.task3.Controller;

import com.codeline.task3.Request.OrderProductsRequest;
import com.codeline.task3.Request.ProductRequest;
import com.codeline.task3.Response.InventoryResponse;
import com.codeline.task3.Response.OrderProductsResponse;
import com.codeline.task3.Service.OrderProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(value = "orderProducts")
public class OrderProductsController {

        @Autowired
        OrderProductsService orderProductsService;

        @RequestMapping(value = "/createOrderProducts" , method = RequestMethod.POST)
        public String createOrderProducts(@RequestBody OrderProductsRequest request){
            try {
                    orderProductsService.createOrderProducts(request);
            } catch (Exception e) {
                return "Failed create";
            }
            return "create Successfully";
        }

    @RequestMapping(value = "/getAllOrderProducts" , method = RequestMethod.GET)
    public List<OrderProductsResponse> getAllOrderProducts() {
        List<OrderProductsResponse> orderProducts = orderProductsService.getAllOrderProducts();
        return orderProducts;
    }

    @RequestMapping(value = "/getOrderProductsById" , method = RequestMethod.GET)
    public OrderProductsResponse getOrderProductsById(@RequestParam Integer orderProductsId) {
        OrderProductsResponse orderProductsResponse = orderProductsService.getOrderProductsById(orderProductsId);
        return orderProductsResponse;
    }

    @RequestMapping(value = "/deleteOrderProductsById", method = RequestMethod.GET)
    public String deleteOrderProductsById(OrderProductsRequest orderProductsRequest){
        try {
            orderProductsService.deleteOrderProductsById(orderProductsRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }


}
