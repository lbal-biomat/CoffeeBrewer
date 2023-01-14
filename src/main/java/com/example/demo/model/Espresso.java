package com.example.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Espresso implements Coffee {
  private CoffeeType type;
  private Double cost;
  private String ingredients;

  public Espresso() {
    this.type = CoffeeType.ESPRESSO;
    this.cost = 3.50;
    this.ingredients = "";
  }

  public CoffeeType getType() {
    return this.type;
  }

  public Double getCost() {
    return this.cost;
  }

  public String getIngredients() {
    return this.ingredients;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Coffee)) {
      return false;
    }
    Coffee coffee = (Coffee) o;
    return coffee.getType().equals(getType()) &&
            coffee.getCost().equals(getCost()) &&
            coffee.getIngredients().equals(getIngredients());
  }

}
