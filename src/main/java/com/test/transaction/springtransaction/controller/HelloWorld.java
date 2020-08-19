package com.test.transaction.springtransaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @GetMapping("/rest/docker/hello")
  public String getMessage(){

    return "Hello Docker Container";

  }

  @PostMapping("/rest/docker/message")
  public String sendMessage(){
    System.out.print("hello");
    System.out.print("hi hello");
System.out.print("hellooooooo");
System.out.print("hi");
    return "Hello Docker Container";

  }

  @GetMapping("/rest/docker")
  public String test(){
    return "Hello Docker Container";
  }
}
