package com.github.drg0n20.recipeapp.controllers;

import com.github.drg0n20.recipeapp.model.Category;
import com.github.drg0n20.recipeapp.model.UnitOfMeasure;
import com.github.drg0n20.recipeapp.repositories.CategoryRepository;
import com.github.drg0n20.recipeapp.repositories.UnitOfMeasureRepository;
import com.github.drg0n20.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }



    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
