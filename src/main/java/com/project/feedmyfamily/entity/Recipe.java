package com.project.feedmyfamily.entity;

import java.util.List;

public class Recipe {
    private long id;
    private String name;
    private String description;
    private String instruction;
    private User user;
    private Visibility visibility;
    private int Duration;
    private Difficulty difficulty;
    private Category category;
    private List<IngredientRecipe> ingredientRecipes;

    public Recipe() {
    }

    public Recipe(long id, String name, String description, String instruction, User user, Visibility visibility, int duration, Difficulty difficulty, Category category, List<IngredientRecipe> ingredientRecipes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instruction = instruction;
        this.user = user;
        this.visibility = visibility;
        Duration = duration;
        this.difficulty = difficulty;
        this.category = category;
        this.ingredientRecipes = ingredientRecipes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<IngredientRecipe> getIngredientRecipes() {
        return ingredientRecipes;
    }

    public void setIngredientRecipes(List<IngredientRecipe> ingredientRecipes) {
        this.ingredientRecipes = ingredientRecipes;
    }
}
