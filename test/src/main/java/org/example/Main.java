package org.example;

import java.net.URL;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    URL resource = Main.class.getClassLoader().getResource("test.properties");
    if (resource == null) {
      throw new RuntimeException("Could not find test.properties");
    }
  }
}
