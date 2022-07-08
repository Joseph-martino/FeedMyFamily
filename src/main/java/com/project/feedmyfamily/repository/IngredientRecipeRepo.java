package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.entity.IngredientRecipe;
import com.project.feedmyfamily.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRecipeRepo extends JpaRepository<IngredientRecipe,Long> {

    IngredientRecipe findIngredientRecipeByIngredientAndRecipe(Ingredient ingredient, Recipe recipe);
}
