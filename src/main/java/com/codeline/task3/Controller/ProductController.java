package com.codeline.task3.Controller;

import com.codeline.task3.Request.ProductRequest;
import com.codeline.task3.Response.OrderProductsResponse;
import com.codeline.task3.Response.ProductResponse;
import com.codeline.task3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/createProduct" , method = RequestMethod.POST)
    public String createProduct(@RequestBody ProductRequest request){
        try {
            productService.createProduct(request);
        } catch (Exception e) {
            return "Failed create";
        }
        return "create Successfully";
    }

    @RequestMapping(value = "/getAllProduct" , method = RequestMethod.GET)
    public List<ProductResponse> getAllProducts() {
        List<ProductResponse> product = productService.getAllProduct();
        return product;
    }

    @RequestMapping(value = "/getProductById" , method = RequestMethod.GET)
    public ProductResponse getProductById(@RequestParam Integer productId) {
        ProductResponse productResponse = productService.getProductById(productId);
        return productResponse;
    }
}
