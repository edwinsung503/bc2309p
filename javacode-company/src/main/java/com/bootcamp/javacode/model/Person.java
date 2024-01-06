package com.bootcamp.javacode.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode
@SuperBuilder
@ToString

public class Person {
  
  private String name;

  public Person(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public Person (){}
}
