package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient,Long> {

}
