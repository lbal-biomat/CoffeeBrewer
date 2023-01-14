package com.example.demo.model;

import java.util.List;

public abstract class CoffeeDecorator implements Coffee {
  protected final Coffee decoratedCoffee;

  public CoffeeDecorator(Coffee decoratedCoffee) {
    this.decoratedCoffee = decoratedCoffee;
  }

  public CoffeeType getType() {
    return decoratedCoffee.getType();
  }

  public Double getCost() {
    return decoratedCoffee.getCost();
  }

  public String getIngredients() {
    return decoratedCoffee.getIngredients();
  }

}
