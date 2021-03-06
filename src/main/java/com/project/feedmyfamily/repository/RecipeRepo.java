package com.project.feedmyfamily.repository;

import com.project.feedmyfamily.entity.CategoryRecipe;
import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.Visibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Long> {

    @Query("select r from Recipe r where r.visibility =:visibility and r.user.id=:id")
    List<Recipe> findByVisibilityAndUser(@Param("visibility") String visibility, @Param("id")Long id) ;

    List<Recipe> findRecipesByUserId(Long id);

    @Query("select r from Recipe r left join r.categoryRecipe cr where cr.id=:categoryRecipeId")
    List<Recipe> findRecipeByCategoryRecipeId(@Param("categoryRecipeId") Long categoryRecipeId);

    @Query("select r from Recipe r left join r.ingredientRecipes ir where ir.ingredient.name=:name")
    List<Recipe> findRecipesByIngredient(@Param("name")String name);

    @Query("select r from Recipe r left join r.ingredientRecipes ir where ir.ingredient.name =:name and r.visibility = 'SHAREDGROUP' and r.visibility = 'SHAREDGLOBAL' ")
    List<Recipe> findRecipesByIngredientAndVisibility(@Param("name")String name);

    List<Recipe> findRecipesByDifficulty(String difficulty);

    @Query("select r from Recipe r where r.visibility = 'SHAREDGLOBAL' ")
    List<Recipe> findAllByVisibilityGlobal();

    @Query("select r from Recipe r left join r.user u left join u.userGroups ug where ug.team.id=:id")
    List<Recipe> findAllRecipesByGroupId(Long id);

}
