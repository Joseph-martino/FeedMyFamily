package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.service.IngredientRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientrecipes")
public class IngredientRecipeController {

    @Autowired
    private IngredientRecipeService ingredientRecipeService;
}
