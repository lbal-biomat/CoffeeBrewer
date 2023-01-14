package com.example.demo.model;

public class Sugar extends CoffeeDecorator {
  public Sugar(Coffee coffee) {
    super(coffee);
  }

  @Override
  public Double getCost() {
    return super.getCost() + 0.5;
  }

  @Override
  public String getIngredients() {
    return super.getIngredients() + ", Sugar";
  }
}
