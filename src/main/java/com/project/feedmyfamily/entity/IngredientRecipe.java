package com.project.feedmyfamily.entity;

import javax.persistence.*;


@Entity
@Table(name = "ingredientrecipe")
public class IngredientRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @Column(name = "quantity", nullable = false)
    private double quantity;

    public IngredientRecipe() {
    }

    public IngredientRecipe(Ingredient ingredient, Recipe recipe, double quantity) {
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.quantity = quantity;
    }

    public IngredientRecipe(Long id, Ingredient ingredient, Recipe recipe, double quantity) {
        Id = id;
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.quantity = quantity;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
