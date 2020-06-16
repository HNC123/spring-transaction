package com.test.transaction.springtransaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @GetMapping("/rest/docker/hello")
  public String getMessage(){
    return "Hello Docker Container";

  }
}
