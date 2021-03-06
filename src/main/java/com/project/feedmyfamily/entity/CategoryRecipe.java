package com.project.feedmyfamily.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoryrecipe")
public class CategoryRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToMany
    @JoinTable(name = "recipehascategory", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "ingredientrecipe_id"))
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
