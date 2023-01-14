package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Getter @Setter
@NoArgsConstructor
public class Brewer {
  public static Coffee brewCoffee(CoffeeType coffeeType) {

    Coffee coffee = new Espresso();

    switch (coffeeType) {
      case ESPRESSO:
        return coffee;
      case LATTE:
        //
      case CAPPUCCINO:
        //
      default:
        throw new IllegalArgumentException("Unknown coffee type");
    }
  }
}
