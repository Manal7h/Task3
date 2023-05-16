package com.codeline.task3.Repository;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Ingredient;
import com.codeline.task3.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
    @Query("SELECT i from Ingredient i")
    List<Ingredient> getAllIngredient();

    @Query("SELECT i from Ingredient i where i.id= :ingredientId")
    Ingredient getIngredientById(@Param("ingredientId") Integer id);
}
