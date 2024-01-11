package com.bootcamp.javacode.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode
@SuperBuilder
@ToString

public class Person {
  
  private String name;

  public static String concat(String str){
    return "hello"+str;
  }

  public Person(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public Person (){}

  
}
