package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.CategoryRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.Visibility;
import com.project.feedmyfamily.model.RecipeModel;
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

@GetMapping("/visibilityAndId/{visibility}/{id}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findByVisibilityAndUser(@PathVariable String visibility, @PathVariable Long id) {
        return this.recipeService.findByVisibilityAndUser(visibility,id);
    }

@GetMapping("/{id}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByUserId(@PathVariable Long id) {
        return this.recipeService.findRecipesByUserId(id);
    }
@GetMapping("/categoryRecipe/{categoryrecipes}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipeByCategoryRecipe(@PathVariable Long categoryRecipeId) {
        return this.recipeService.findRecipeByCategoryRecipe(categoryRecipeId);
    }

@GetMapping("/name/{name}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByIngredient(@PathVariable String name) {
        return this.recipeService.findRecipesByIngredient(name);
    }

@GetMapping("/ingredient/{name}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByIngredientAndVisibility(@PathVariable String name) {
        return this.recipeService.findRecipesByIngredientAndVisibility(name);
    }
@GetMapping("/difficulty/{difficulty}")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findRecipesByDifficulty(@PathVariable String difficulty) {
        return this.recipeService.findRecipesByDifficulty(difficulty);
    }

@GetMapping("/visibility")
@ResponseStatus(code = HttpStatus.OK)
    List<Recipe> findAllByVisibilityGlobal() {
        return this.recipeService.findAllByVisibilityGlobal();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe create(@RequestBody Recipe recipe){
       return this.recipeService.save(recipe);
    }
    @GetMapping("/group/{id}")
    public List<RecipeModel> findAllRecipesByGroupId(@PathVariable Long id){
        return this.recipeService.findAllRecipesByGroupId(id);
    }
}
