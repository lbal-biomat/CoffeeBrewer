package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Brewer {
  public static Coffee brewCoffee(Recipe recipe, CoffeeType coffeeType) {

    Coffee coffee = new Espresso(coffeeType);

    for (int i = 0; i < recipe.getNeededSugar(); i++) {
      coffee = new Sugar(coffee);
    }
    for (int i = 0; i < recipe.getNeededMilk(); i++) {
      coffee = new Milk(coffee);
    }
    return coffee;

  }
}
