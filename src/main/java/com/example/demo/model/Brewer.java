package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor
public class Brewer {
  public static Coffee brewCoffee(String coffeeType) {
    return new Espresso();
  }
}
