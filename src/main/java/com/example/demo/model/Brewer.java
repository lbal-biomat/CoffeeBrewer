package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Brewer {
  public static Coffee brewCoffee(Recipe recipe) {


    Coffee coffee = new Espresso();

    for (int i = 0; i < recipe.getNeededSugar(); i++) {
      coffee = new Sugar(coffee);
    }
    for (int i = 0; i < recipe.getNeededMilk(); i++) {
      coffee = new Milk(coffee);
    }
    return coffee;

  }
}
