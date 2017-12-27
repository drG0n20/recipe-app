package com.github.drg0n20.recipeapp.repositories;

import com.github.drg0n20.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
