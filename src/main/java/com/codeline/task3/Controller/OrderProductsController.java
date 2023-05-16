package com.codeline.task3.Controller;

import com.codeline.task3.Request.OrderProductsRequest;
import com.codeline.task3.Service.OrderProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
