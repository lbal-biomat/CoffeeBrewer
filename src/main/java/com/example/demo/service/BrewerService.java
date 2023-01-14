package com.example.demo.service;

import com.example.demo.model.Brewer;
import com.example.demo.model.Coffee;
import com.example.demo.model.CoffeeType;
import com.example.demo.model.Recipe;
import org.springframework.stereotype.Service;

@Service
public class BrewerService {
  private Brewer brewer = new Brewer();



  public Coffee brewCoffee(CoffeeType type) {
    Recipe recipe;
    switch (type) {
      case ESPRESSO:
        recipe = new Recipe(CoffeeType.ESPRESSO, 0, 0);
        break;
      case CAPPUCCINO:
        recipe = new Recipe(CoffeeType.CAPPUCCINO, 1, 1);
        break;
      case LATTE:
        recipe = new Recipe(CoffeeType.LATTE, 1, 2);
        break;
      default:
        throw new IllegalArgumentException("Unknown coffee type: " + type);
    }
    return brewer.brewCoffee(recipe);
  }
}
