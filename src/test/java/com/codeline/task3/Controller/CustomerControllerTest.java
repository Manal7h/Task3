package com.codeline.task3.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerControllerTest {
@Autowired
CustomerController customerController;

//    @Test
//    void getAllCustomer() {
//
//    }
    @Test
    void getCustomerById() throws Exception {
        String customerName = customerController.getCustomerById(4).getCName();
        assertEquals("Maha",customerName);
    }
}