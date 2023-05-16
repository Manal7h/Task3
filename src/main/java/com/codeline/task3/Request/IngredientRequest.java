package com.codeline.task3.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class IngredientRequest{

    Integer ingredientId;
    String ingredientName;
    Integer productId;
}
