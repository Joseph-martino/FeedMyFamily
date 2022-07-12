package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.entity.IngredientRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.repository.IngredientRecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class IngredientRecipeService {

    @Autowired
    private IngredientRecipeRepo ingredientRecipeRepo;

    public IngredientRecipe findIngredientRecipeByIngredientAndRecipe(@PathVariable Ingredient ingredient,@PathVariable Recipe recipe) {
        return this.ingredientRecipeRepo.findIngredientRecipeByIngredientAndRecipe(ingredient,recipe);
    }
}
