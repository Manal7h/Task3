package com.codeline.task3.Controller;

import com.codeline.task3.Request.IngredientRequest;
import com.codeline.task3.Request.InventoryRequest;
import com.codeline.task3.Response.IngredientResponse;
import com.codeline.task3.Response.InventoryResponse;
import com.codeline.task3.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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



    @RequestMapping(value = "/deleteIngredientById", method = RequestMethod.GET)
    public String deleteIngredientById(IngredientRequest ingredientRequest){
        try {
            ingredientService.deleteIngredientById(ingredientRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }

    @RequestMapping(value = "/getAllIngredient" , method = RequestMethod.GET)
    public List<IngredientResponse> getAllIngredient() {
        List<IngredientResponse> ingredient = ingredientService.getAllIngredient();
        return ingredient;
    }

    @RequestMapping(value = "/getIngredientById" , method = RequestMethod.GET)
    public IngredientResponse getIngredientById(@RequestParam Integer ingredientId) {
        IngredientResponse ingredientResponse = ingredientService.getIngredientById(ingredientId);
        return ingredientResponse;
    }


}
