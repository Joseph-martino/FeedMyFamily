package com.project.feedmyfamily.entity;

import java.util.List;

public class CategoryRecipe {
    private Long id;

    private String name;

    private List<Recipe> recipes;

    public CategoryRecipe() {
        super();
    }

    public CategoryRecipe(Long id, String name, List<Recipe> recipes) {
        this.id = id;
        this.name = name;
        this.recipes = recipes;
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

    
}
