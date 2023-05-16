package com.codeline.task3.Repository;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
}
