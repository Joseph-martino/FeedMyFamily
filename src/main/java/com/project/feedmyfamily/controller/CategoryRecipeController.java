package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.entity.CategoryRecipe;
import com.project.feedmyfamily.service.CategoryRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoryrecipes")
public class CategoryRecipeController {

    @Autowired
    private CategoryRecipeService categoryRecipeService;

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public CategoryRecipe findById (@PathVariable Long id){
        return this.categoryRecipeService.findById(id);
    }


}
