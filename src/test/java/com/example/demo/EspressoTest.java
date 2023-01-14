package com.example.demo;

import com.example.demo.controller.BrewerController;
import com.example.demo.model.Coffee;
import com.example.demo.model.CoffeeType;
import com.example.demo.model.Espresso;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class EspressoTest {
  @Autowired
  BrewerController brewerController;
  @Autowired
  private MockMvc mockMvc;
  private static ObjectWriter writer;
  @BeforeAll
  public static void setUp() {
    writer = new ObjectMapper()
            .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
            .writer().withDefaultPrettyPrinter();

  }

  @Test
  void shouldReturnCoffee() throws Exception {
    //arrange
    Coffee coffee = new Espresso(CoffeeType.ESPRESSO);
    String json = writer.writeValueAsString(coffee);
    MockHttpServletRequestBuilder request = MockMvcRequestBuilders
            .get("/coffee/{name}", "espresso");

    ResultMatcher expectedStatus = status().isOk();
    ResultMatcher expectedContentType = content().contentType(MediaType.APPLICATION_JSON);
    ResultMatcher expectedBody = content().json(json);

    //act
    mockMvc.perform(request)
            .andDo(MockMvcResultHandlers.print())
            .andExpect(expectedContentType)
            .andExpect(expectedBody)
            .andExpect(expectedStatus);
  }

}
