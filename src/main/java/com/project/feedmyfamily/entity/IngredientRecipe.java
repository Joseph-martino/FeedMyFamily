package com.project.feedmyfamily.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ingredientrecipe")
public class IngredientRecipe {

    @EmbeddedId
    private IngredientRecipeId id;
    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @Column(name = "quantity")
    @NotNull
    private double quantity;

    public IngredientRecipe() {
    }

    public IngredientRecipe(IngredientRecipeId id, Ingredient ingredient, Recipe recipe, double quantity) {
        this.id = id;
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.quantity = quantity;
    }

    public IngredientRecipeId getId() {
        return id;
    }

    public void setId(IngredientRecipeId id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
