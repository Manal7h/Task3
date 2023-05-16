package com.codeline.task3.Service;
import com.codeline.task3.Model.Ingredient;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.IngredientRepository;
import com.codeline.task3.Repository.ProductRepository;
import com.codeline.task3.Request.IngredientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class IngredientService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    IngredientRepository ingredientRepository;

    public String createIngredient(IngredientRequest request) {
        Ingredient ingredient = new Ingredient();
        ingredient.setIngredientName(request.getIngredientName());
        Product product = productRepository.findById(request.getProductId()).get();
        ingredient.setProduct(product);
        ingredient.setIsActive(true);
        ingredient.setCreatedDate(new Date());
        ingredientRepository.save(ingredient);
        return "Ingredient Created Successfully";
    }

}
