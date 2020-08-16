package com.test.transaction.springtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTransactionApplication {

  public static void main(String[] args) {
  System.out.println("main program");
    System.out.println("spring boot");
    SpringApplication.run(SpringTransactionApplication.class, args);
  }

}
