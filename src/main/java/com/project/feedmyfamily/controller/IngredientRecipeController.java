package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.service.IngredientRecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientrecipes")
public class IngredientRecipeController {

    private IngredientRecipeService ingredientRecipeService;
}
