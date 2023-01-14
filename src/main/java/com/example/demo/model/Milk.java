package com.example.demo.model;

public class Milk extends CoffeeDecorator {
  public Milk(Coffee coffee) {
    super(coffee);
  }

  @Override
  public Double getCost() {
    return super.getCost() + 0.5;
  }

  @Override
  public String getIngredients() {
    return super.getIngredients() + ", Milk";
  }

}
