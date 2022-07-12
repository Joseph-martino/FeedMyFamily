package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.entity.IngredientRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.repository.IngredientRecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientRecipeService {

    @Autowired
    private IngredientRecipeRepo ingredientRecipeRepo;

    public IngredientRecipe findIngredientRecipeByIngredientAndRecipe(@PathVariable Ingredient ingredient,@PathVariable Recipe recipe) {
        return this.ingredientRecipeRepo.findIngredientRecipeByIngredientAndRecipe(ingredient,recipe);
    }

    public List<IngredientRecipe> findById(Long id) {
        Optional<IngredientRecipe> optionalIngredientRecipe = this.ingredientRecipeRepo.findById(id);
        if(optionalIngredientRecipe.isPresent()){
            return (List<IngredientRecipe>) optionalIngredientRecipe.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "L'ingredient n'existe pas dans la recette");
        }
    }
}
