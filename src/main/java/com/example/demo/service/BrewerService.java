package com.example.demo.service;

import com.example.demo.model.Brewer;
import com.example.demo.model.Coffee;
import com.example.demo.model.CoffeeType;
import com.example.demo.model.Recipe;
import com.example.demo.repo.RepoRecipies;
import org.springframework.stereotype.Service;

@Service
public class BrewerService {

  private final RepoRecipies repoRecipies;

  public BrewerService(RepoRecipies repoRecipies) {
    this.repoRecipies = repoRecipies;
  }

  public Coffee brewCoffee(CoffeeType type) {
    Recipe recipe = repoRecipies.getRecipe(type);
    return Brewer.brewCoffee(recipe, type);
  }
}
