package com.github.controller;

import com.github.model.User;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@CrossOrigin
@RequestMapping("status")
public class Status {

  @GetMapping()
  public List<User> getStatus() {
    return List.of(new User(1, "bipin"));
  }
}
