package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.entity.IngredientRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.service.IngredientRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientrecipes")
public class IngredientRecipeController {

    @Autowired
    private IngredientRecipeService ingredientRecipeService;

    @GetMapping("/ingredients/recipes")
    @ResponseStatus(code = HttpStatus.OK)
    IngredientRecipe findIngredientRecipeByIngredientAndRecipe(Ingredient ingredient, Recipe recipe) {
        return this.ingredientRecipeService.findIngredientRecipeByIngredientAndRecipe(ingredient,recipe);
    }
}
