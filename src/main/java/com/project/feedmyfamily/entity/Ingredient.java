package com.project.feedmyfamily.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    @NotNull
    @Size(max = 50)
    private String name;
    @Column(name = "type")
    @NotNull
    @Size(max = 50)
    private String type;
    @OneToMany
    @JoinColumn(name = "ingredientrecipes")
    private List<IngredientRecipe> ingredientRecipes;

    public Ingredient() {
        super();
    }

    public Ingredient(Long id, String name, String type, List<IngredientRecipe> ingredientRecipes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.ingredientRecipes = ingredientRecipes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<IngredientRecipe> getIngredientRecipes() {
        return ingredientRecipes;
    }

    public void setIngredientRecipes(List<IngredientRecipe> ingredientRecipes) {
        this.ingredientRecipes = ingredientRecipes;
    }
}
