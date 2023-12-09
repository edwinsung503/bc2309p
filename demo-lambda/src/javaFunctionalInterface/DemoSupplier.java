package javaFunctionalInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class DemoSupplier {
  //T get()
  Supplier<Person> person = () -> {
    return new Student(1, "John");
  };

  //List<String> str = new LinkedList<>();
  //T -> List<String> (return type)
  Supplier<List<String>> linkedList = () -> {
    return new LinkedList<>();
  };
  Supplier<List<String>> arrayList = () -> {
    return new ArrayList<>();
  };

  List<String> ll = linkedList.get();
  ll.add("Hello");
}
