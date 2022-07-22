package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.entity.IngredientRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.service.IngredientRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/ingredientrecipes")
public class IngredientRecipeController {

    @Autowired
    private IngredientRecipeService ingredientRecipeService;



    @GetMapping("/ingredients/recipes")
    @ResponseStatus(code = HttpStatus.OK)
    public IngredientRecipe findIngredientRecipeByIngredientAndRecipe(@RequestParam(name = "idIngredient") Long idIngredient,@RequestParam("idRecipe") Long idRecipe) {
        return this.ingredientRecipeService.findIngredientRecipeByIngredientAndRecipe(idIngredient,idRecipe);
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public IngredientRecipe findById(@PathVariable Long id) {
        return this.findById(id);
    }
}
