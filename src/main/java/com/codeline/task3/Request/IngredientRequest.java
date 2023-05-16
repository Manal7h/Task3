package com.codeline.task3.Request;

import com.codeline.task3.Model.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Getter
@Setter
@Data
public class IngredientRequest {

    Integer ingredientId;
    String ingredientName;
    Integer productId;
}
