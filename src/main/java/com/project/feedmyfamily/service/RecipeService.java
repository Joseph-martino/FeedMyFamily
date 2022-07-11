package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Recipe;
import com.project.feedmyfamily.entity.User;
import com.project.feedmyfamily.repository.RecipeRepo;
import com.project.feedmyfamily.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepo recipeRepo;

    public List<Recipe> findAll(){
        return this.recipeRepo.findAll();
    }

    public Recipe findById(Long id){
        Optional<Recipe> optionalRecipe = this.recipeRepo.findById(id);
        if(optionalRecipe.isPresent()){
            return optionalRecipe.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La recette n'existe pas");
        }
    }









}
