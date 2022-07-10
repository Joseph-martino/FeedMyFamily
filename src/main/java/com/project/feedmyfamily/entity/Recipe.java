package com.project.feedmyfamily.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "description", length = 100)
    private String description;
    @Column(name = "instruction", nullable = false, length = 512)
    private String instruction;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "visibility", nullable = false)
    private String visibility;
    @Column(name = "duration")
    private int Duration;
    @Column(name = "difficulty")
    private String difficulty;
    @ManyToMany(mappedBy = "recipes")
    private List<CategoryRecipe> categoryRecipe;
    @OneToMany(mappedBy= "recipe")
    private List<IngredientRecipe> ingredientRecipes;

    public Recipe() {
    }

    public Recipe(long id, String name, String description, String instruction, User user, String visibility, int duration, String difficulty, List<CategoryRecipe> categoryRecipe, List<IngredientRecipe> ingredientRecipes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instruction = instruction;
        this.user = user;
        this.visibility = visibility;
        Duration = duration;
        this.difficulty = difficulty;
        this.categoryRecipe = categoryRecipe;
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



    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<CategoryRecipe> getCategoryRecipe() {
        return categoryRecipe;
    }

    public void setCategoryRecipe(List<CategoryRecipe> categoryRecipe) {
        this.categoryRecipe = categoryRecipe;
    }

    public List<IngredientRecipe> getIngredientRecipes() {
        return ingredientRecipes;
    }

    public void setIngredientRecipes(List<IngredientRecipe> ingredientRecipes) {
        this.ingredientRecipes = ingredientRecipes;
    }
}
