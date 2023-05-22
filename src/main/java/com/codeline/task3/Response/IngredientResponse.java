package com.codeline.task3.Response;

import com.codeline.task3.Model.Ingredient;
import com.codeline.task3.Model.Inventory;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
public class IngredientResponse {




    String iName;
    Integer pId;

    public static IngredientResponse convertToResponse(Ingredient request) {
        return IngredientResponse.builder()
                .iName(request.getIngredientName())
                .pId(request.getProduct().getProductId())
                .build();
    }

    public static List<IngredientResponse> convertToResponseList(List<Ingredient> request) {
        List<IngredientResponse> ingredientResponseList = new ArrayList<>();
        for (Ingredient ingredientRequest : request) {
            ingredientResponseList.add(convertToResponse(ingredientRequest));
        }
        return ingredientResponseList;
    }
}
