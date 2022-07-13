package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.CategoryRecipe;
import com.project.feedmyfamily.repository.CategoryRecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CategoryRecipeService {

    @Autowired
    private CategoryRecipeRepo categoryRecipeRepo;

    public CategoryRecipe findById(Long id) {
        Optional<CategoryRecipe> optionalCategoryRecipe;
        optionalCategoryRecipe = this.categoryRecipeRepo.findById(id);
        if (optionalCategoryRecipe.isPresent()){
            return optionalCategoryRecipe.get();
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


}
