package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.service.CategoryRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoryrecipes")
public class CategoryRecipeController {

    @Autowired
    private CategoryRecipeService categoryRecipeService;



}
