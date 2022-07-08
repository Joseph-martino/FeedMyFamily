package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.IngredientRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRecipeRepo extends JpaRepository<IngredientRecipe,Long> {

    IngredientRecipe findIngredientRecipeByIngredientAndRecipe();
}
