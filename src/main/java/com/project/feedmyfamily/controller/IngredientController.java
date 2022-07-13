package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.Ingredient;
import com.project.feedmyfamily.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Ingredient> findAll(){
        return this.ingredientService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Ingredient findById(@PathVariable Long id){
        return this.ingredientService.findById(id);
    }


}
