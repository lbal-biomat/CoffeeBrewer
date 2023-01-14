package com.example.demo.repo;

import com.example.demo.model.CoffeeType;
import com.example.demo.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.EnumMap;
import java.util.Map;

@Repository
public class RepoRecipies {

    Map<CoffeeType, Recipe> recipies;

    public RepoRecipies() {
        recipies = new EnumMap<>(CoffeeType.class);
        recipies.put(CoffeeType.CAPPUCCINO, new Recipe(2, 2));
        recipies.put(CoffeeType.ESPRESSO, new Recipe(0, 0));
        recipies.put(CoffeeType.LATTE, new Recipe(1, 2));
    }

    public Recipe getRecipe(CoffeeType type) {
        return recipies.get(type);
    }
}
