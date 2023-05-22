package com.codeline.task3.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class InventoryControllerTest {
    @Autowired
            InventoryController inventoryController;

    @Test
    void getInventoryById() throws Exception{
        String inventoryLocation = inventoryController.getInventoryById(1).getILocation();
        assertEquals("Musct",inventoryLocation);
    }
}