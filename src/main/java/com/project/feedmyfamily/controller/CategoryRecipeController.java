package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.service.CategoryRecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoryrecipes")
public class CategoryRecipeController {

    private CategoryRecipeService categoryRecipeService;
}
