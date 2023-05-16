package com.codeline.task3.Controller;

import com.codeline.task3.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "order")
public class OrderController {

        @Autowired
        OrderService orderService;

//        @RequestMapping(value = "/createOrder" , method = RequestMethod.POST)
//        public String createOrder(@RequestBody OrderRequest request){
//            try {
//                orderService.createOrder(request);
//            } catch (Exception e) {
//                return "Failed Delete";
//            }
//            return "Delete Successfully";
//        }
}
