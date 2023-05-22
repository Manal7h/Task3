package com.codeline.task3.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductControllerTest {
@Autowired
ProductController productController;
    @Test
    void getProductById() throws Exception{
        String productName = productController.getProductById(1).getPName();
        assertEquals("Milk Chocolate Bar",productName);
    }
}