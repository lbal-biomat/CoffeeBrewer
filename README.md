# CoffeeMachine

This is a simple coffee machine simulator. 
It is a REST API that can be used to make coffee.
It is written in Java and uses the Spring Boot framework.

The project was created as a coding exercise to practice TDD. 
It uses the decorator design pattern to allow for easy extension of the beverage.

# Get a cup of coffee


* **URL :**

  /coffee/{type}


* **Method :**

  GET


* **URL Params :**

  **Required:**

  type=[ESPRESSO|CAPPUCCINO|LATTE]


* **Success response content:**
```json
  {
    "cost" : 5.0,
    "ingredients" : "Espresso, Sugar, Milk, Milk",
    "type" : "LATTE"
  }
```


* **Response Codes:**

  Success (200 OK)
