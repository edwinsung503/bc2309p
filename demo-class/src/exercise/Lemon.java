package exercise;

import exercise2.Apple;

public class Lemon {
  
  public static void main(String[] args) {
    Apple apple = new Apple();
    //apple.name; 
    //because the attribute "name" is protected in the class Apple
    //and Lemon.java and Apple.java are in different package (folder) 

    //Because Cat.java is package-exercise
    //Cat cat = new Cat();
  }
}
