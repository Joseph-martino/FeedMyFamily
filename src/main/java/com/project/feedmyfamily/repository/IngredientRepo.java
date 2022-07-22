package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredient,Long> {

}
