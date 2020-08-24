package com.test.transaction.springtransaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @GetMapping("/rest/docker/hello")
  public String getMessage(){
    System.out.print("getMessage1");
    System.out.print("getMessage2")
System.out.print("getMessage4");
System.out.print("getMessage2");
    return "Hello Docker Container";

  }

  @PostMapping("/rest/docker/message")
  public String sendMessage(){
    System.out.print("getMessage2");
        return "Hello Docker Container";
  }

  @GetMapping("/rest/docker")
  public String test(){
    System.out.print("test1");
System.out.print("test3");
System.out.print("test2");
    return "Hello Docker Container";
  }
}
