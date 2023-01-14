package com.example.demo.model;

import java.util.Objects;

public class Espresso implements Coffee {
  private final CoffeeType type;
  private final Double cost;
  private final String ingredients;

  public Espresso(CoffeeType coffeeType) {
    this.type = coffeeType;
    this.cost = 3.50;
    this.ingredients = "Espresso";
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

  @Override
  public int hashCode() {
    return Objects.hash(getType());
  }

}
