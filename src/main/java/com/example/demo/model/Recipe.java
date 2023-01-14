package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Recipe {
  private CoffeeType coffeeType;
  private int neededSugar;
  private int neededMilk;
}
