package com.test.transaction.springtransaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @GetMapping("/rest/docker/hello")
  public String getMessage(){
  System.out.println("getmessage")
    System.out.println("docker getmessage");
    return "Hello Docker Container";

  }

  @PostMapping("/rest/docker/message")
  public String sendMessage(){
  System.out.println("sendmessage")
    System.out.println("sendmessage")
    return "Hello Docker Container";

  }

  @GetMapping("/rest/docker")
  public String test(){
System.out.println("sendmessage")
System.out.println("testing using git gui....")
  System.out.println("testing using git gui")
System.out.println("testing using git gui3")
  System.out.println("testing using git gui")
    return "Hello Docker Container";
  }
}
