package com.github.drg0n20.recipeapp.services;

import com.github.drg0n20.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
