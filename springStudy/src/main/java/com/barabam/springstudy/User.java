package com.barabam.springstudy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

  private String name;
  private String email;
  private int age;
}
