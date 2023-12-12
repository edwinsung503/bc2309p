package javaFunctionalInterface;

import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    //void accpet (T t)
    Consumer<Person> c = (p) -> {
      System.out.println(p.getName());
    };

    //we can skip the () if there is only one parameter p
    Consumer<Person> printName = p -> {
      System.out.println(p.getName());
    };
    
    printName.accept(new Person("John"));
  }
}
