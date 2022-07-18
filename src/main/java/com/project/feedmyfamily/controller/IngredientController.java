package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.model.IngredientModel;
import com.project.feedmyfamily.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<IngredientModel> findAll(){
        List<Ingredient> ingredients = this.ingredientService.findAll();
        List<IngredientModel> resultat = new ArrayList<>();
        for (Ingredient ingredient: ingredients
             ) {
            resultat.add(new IngredientModel(ingredient));
        }
        return resultat;
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public IngredientModel findById(@PathVariable Long id){
        Ingredient ingredient = this.ingredientService.findById(id);
        return new IngredientModel(ingredient);
    }


}
