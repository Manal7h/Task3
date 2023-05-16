package com.codeline.task3.Controller;

import com.codeline.task3.Request.IngredientRequest;
import com.codeline.task3.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "ingredient")
public class IngredientController {
    @Autowired
    IngredientService ingredientService;

    @RequestMapping(value = "/createIngredient" , method = RequestMethod.POST)
    public String createIngredient(@RequestBody IngredientRequest request){
        try {
            ingredientService.createIngredient(request);
        } catch (Exception e) {
            return "Failed create";
        }
        return "create Successfully";
    }
}
