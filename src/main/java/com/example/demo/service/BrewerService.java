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

  /**
   * Brews a coffee of the given type.
   * @param coffeeType The type of coffee to brew.
   * @return The brewed coffee.
   */
  public Coffee brewCoffee(CoffeeType coffeeType) {
    Recipe recipe = repoRecipies.getRecipe(coffeeType);
    return Brewer.brewCoffee(recipe, coffeeType);
  }
}
