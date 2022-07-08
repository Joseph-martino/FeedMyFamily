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

    @Query("select r from Recipe r left join IngredientRecipe ir where ir.ingredient.name =: name")
    List<Recipe> findRecipesByIngredient(@Param("name")String name);

    @Query("select r from Recipe r left join IngredientRecipe ir where ir.ingredient.name =: name and r.visibility = 'SHAREDGROUP' and r.visibility = 'SHAREDGLOBAL' ")
    List<Recipe> findRecipesByIngredientAndVisibility(@Param("name")String name, @Param("visibility")String visibility);

    List<Recipe> findRecipesByDifficulty();

    @Query("select r from Recipe r where r.visibility = 'SHAREDGLOBAL' ")
    List<Recipe> findAllByVisibilityGlobal();

}
