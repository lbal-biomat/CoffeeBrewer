package com.example.demo.controller;

import com.example.demo.model.Brewer;
import com.example.demo.model.Coffee;
import com.example.demo.model.CoffeeType;
import com.example.demo.service.BrewerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ControllerTest {

  @Mock
  BrewerService brewerService;

  @InjectMocks
  BrewerController brewerController;

  @Test
  void testBrewCoffee() {
    // arrange
    Coffee coffee = Brewer.brewCoffee(CoffeeType.ESPRESSO);
    when(brewerService.brewCoffee(CoffeeType.ESPRESSO)).thenReturn(coffee);


    // act
    ResponseEntity<Coffee> coffeeRE = brewerController.brewCoffee("ESPRESSO");

    // assert
    assertEquals(coffee, coffeeRE.getBody());
    assertEquals(HttpStatus.OK, coffeeRE.getStatusCode());
  }


}
