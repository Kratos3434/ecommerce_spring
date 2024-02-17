package com.commerce.commerce_backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
  @GetMapping("/")
  public String hello() {
    return "Hi, Dad";
  }

  @GetMapping("/users")
  public ArrayList<Map<String, String>> getUsers() {
    ArrayList<Map<String, String>> users = new ArrayList<>();
    HashMap<String, String> map = new HashMap<>();
    map.put("Foo", "Bar");
    users.add(map);
    return users;
  }
}
