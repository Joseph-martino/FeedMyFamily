package com.project.feedmyfamily.service;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.repository.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepo ingredientRepo;

    public List<Ingredient> findAll() {
       return this.ingredientRepo.findAll();
    }

    public Ingredient findById(Long id) {
        Optional<Ingredient> optionalIngredient;
        optionalIngredient = this.ingredientRepo.findById(id);
        if (optionalIngredient.isPresent()){
            return optionalIngredient.get();
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
