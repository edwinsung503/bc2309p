package com.bootcamp.javacode.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Calculators {
  
  public static int add(int x, int y){ 
    // we need to define the method signature before defining the test case
    return x+y;
  }
  // ascending order
  public static List<Integer> sort(int[] arr){
    // arr -> list
    //list -> sort?
    List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
    Collections.sort(result);
    return result;

    // - `Arrays.stream(arr)` converts the array `arr` into a Stream.
    // - `.boxed()` converts the Stream of primitives to a Stream of wrapper Objects.
    // - `.collect(Collectors.toList())` collects the Stream into a new List.
    
  }
  public static int deduct (int x, int y){
    return x - y;
  }
}
