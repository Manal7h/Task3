package com.codeline.task3.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderProductsControllerTest {
@Autowired
OrderProductsController orderProductsController;
    @Test
    void getOrderProductsById() throws Exception{
        Integer quantity = orderProductsController.getOrderProductsById(1).getQuanti();
        assertEquals(20 ,quantity);
    }
}