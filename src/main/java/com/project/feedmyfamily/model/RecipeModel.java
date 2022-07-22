package com.project.feedmyfamily.model;

import com.project.feedmyfamily.entity.Recipe;

public class RecipeModel {
    private Long id;
    private String name;
    private String description;
    private String instruction;

    private String visibility;

    private  int duration;
    private String difficulty;
    private Long userId;


    public RecipeModel(Recipe recipe){
        this.setId(recipe.getId());
        this.setName(recipe.getName());
        this.setDescription(recipe.getDescription());
        this.setInstruction(recipe.getInstruction());
        this.setVisibility(recipe.getVisibility());
        this.setDuration(recipe.getDuration());
        this.setDifficulty(recipe.getDifficulty());
        this.setUserId(recipe.getUser().getId());
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
