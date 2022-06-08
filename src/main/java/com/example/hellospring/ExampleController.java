package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @GetMapping(value = "/hello")
  public String getProduct() {
    return "Hello, World!";
  }

}
