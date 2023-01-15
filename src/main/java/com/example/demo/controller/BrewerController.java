package com.example.demo.controller;

import com.example.demo.model.Coffee;
import com.example.demo.model.CoffeeType;
import com.example.demo.service.BrewerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrewerController {
  private final BrewerService brewerService;

  public BrewerController(BrewerService brewerService) {
    this.brewerService = brewerService;
  }

  /**
   * Brews a coffee of the given type.
   * @param type The type of coffee to brew.
   * @return A response entity with the brewed coffee in the body.
   */
  @GetMapping("/coffee/{type}")
  public ResponseEntity<Coffee> brewCoffee(@PathVariable String type) {
    Coffee coffee = brewerService.brewCoffee(CoffeeType.valueOf(type.toUpperCase()));
    return ResponseEntity.ok(coffee);
  }
}
