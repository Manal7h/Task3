package com.codeline.task3.Controller;

import com.codeline.task3.Request.ProductRequest;
import com.codeline.task3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    ProductService productService;

//    @RequestMapping(value = "/createProduct" , method = RequestMethod.POST)
//    public String createProduct(@RequestBody ProductRequest request){
//        try {
//            productService.createProduct(request);
//        } catch (Exception e) {
//            return "Failed Delete";
//        }
//        return "Delete Successfully";
//    }
}
