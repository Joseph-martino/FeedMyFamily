package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.CategoryRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.Visibility;
import com.project.feedmyfamily.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

@GetMapping("/{visibility}/{id}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findByVisibilityAndUser(@PathVariable String visibility, @PathVariable Long id) {
        return this.recipeService.findByVisibilityAndUser(visibility,id);
    }

@GetMapping("/{id}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByUserId(@PathVariable Long id) {
        return this.recipeService.findRecipesByUserId(id);
    }
@GetMapping("/categoryrecipes")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipeByCategoryRecipe(@PathVariable CategoryRecipe categoryRecipe) {
        return this.recipeService.findRecipeByCategoryRecipe(categoryRecipe);
    }

@GetMapping("/name")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByIngredient(@PathVariable String name) {
        return this.recipeService.findRecipesByIngredient(name);
    }

@GetMapping("/name/visibility")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByIngredientAndVisibility(@PathVariable String name, @PathVariable String visibility) {
        return this.recipeService.findRecipesByIngredientAndVisibility(name,visibility);
    }
@GetMapping("/difficulty")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByDifficulty(@PathVariable String difficulty) {
        return this.recipeService.findRecipesByDifficulty(difficulty);
    }

@GetMapping("/visibility")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findAllByVisibilityGlobal() {
        return this.recipeService.findAllByVisibilityGlobal();
    }
}
