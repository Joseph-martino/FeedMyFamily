package com.project.feedmyfamily.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class IngredientRecipeId implements Serializable {
    private long recipeId;
    private long ingredientId;
}
