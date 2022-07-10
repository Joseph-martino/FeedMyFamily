package com.project.feedmyfamily.controller;

import com.project.feedmyfamily.service.IngredientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private IngredientService ingredientService;
}
