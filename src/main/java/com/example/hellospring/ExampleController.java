package com.example.hellospring

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class ExampleController {  

  @GetMapping(value = "/")  
  public String getProduct()   
  {  
    return "🏆🏆🏆 Congrats 🏆🏆🏆";  
  }  
}
