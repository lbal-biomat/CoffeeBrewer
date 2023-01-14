package com.example.demo.service;

import com.example.demo.model.Brewer;
import com.example.demo.model.Coffee;
import org.springframework.stereotype.Service;

@Service
public class BrewerService {
  private Brewer brewer = new Brewer();



  public Coffee brewCoffee(String type) {
    return brewer.brewCoffee(type);
  }
}
