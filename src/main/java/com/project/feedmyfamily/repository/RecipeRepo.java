package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.Visibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Long> {

    @Query("select r from Recipe r where r.visibility =: visibility and r.user.id =: id")
    List<Recipe> findByVisibilityAndUser(@Param("visibility") Visibility visibility, @Param("id")Long id) ;

    @Query("select r from Recipe r where r.user.id =: id")
    List<Recipe> findRecipesByUser(@Param("id")Long id);

    List<Recipe> findRecipeByCategoryRecipe();

    
}
