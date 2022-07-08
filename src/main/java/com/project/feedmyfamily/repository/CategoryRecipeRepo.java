package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.CategoryRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRecipeRepo extends JpaRepository<CategoryRecipe,Long> {
}
