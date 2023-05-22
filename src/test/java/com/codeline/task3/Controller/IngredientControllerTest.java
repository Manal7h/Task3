package com.codeline.task3.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class IngredientControllerTest {
    @Autowired
    IngredientController ingredientController;

    @Test
    void getIngredientById() throws Exception{
        String ingredientName = ingredientController.getIngredientById(1).getIName();
        assertEquals("cocoa",ingredientName);
    }

}