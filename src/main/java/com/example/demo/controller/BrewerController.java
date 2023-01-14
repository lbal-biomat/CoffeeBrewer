package com.example.demo.controller;

import com.example.demo.model.Coffee;
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

  @GetMapping("/coffee/{type}")
  public ResponseEntity<Coffee> brewCoffee(@PathVariable String type) {
    Coffee coffee = brewerService.brewCoffee(type);
    return ResponseEntity.ok(coffee);
  }
}
