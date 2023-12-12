package javaFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoPredicate {

  public static void main(String[] args) {
    //Predicate is a boolean formula
    //Function<Integer, Boolean> -> Predicate<Integer>
    Predicate<Integer> isOdd = x -> x % 2 == 1 ;

    System.out.println(isOdd.test(2));//false

    Predicate<Integer> isPositive = x -> x>0 ;
    System.out.println(isPositive.test(2));//true
    System.out.println(isPositive.test(-2));//false
    
    //Combine two Predicate<T> together
    System.out.println(isOdd.and(isPositive).test(9));//true
    System.out.println(isOdd.and(isPositive).test(-7));//false

    System.out.println(isOdd.or(isPositive).test(10));//true

    
    BiPredicate<Integer,Integer> isLargerThan = (x,y) -> x > y ;
    System.out.println(isLargerThan.test(10,9));//true
    //Approach 1
    int x = 100;
    boolean isOVerSomething = x > 20;
    
    //Approach 2
    Predicate<Integer> isOverSomthingForumla = num -> num > 20 ;// no solution -> just state an event
    System.out.println(isOverSomthingForumla.test(100));
    //Approach 3
    System.out.println(testM(100));

    BiFunction<Integer,Integer,String> isConcat = (num1,num2) -> {
      return String.valueOf(num1).concat(String.valueOf(num2));
    };
    System.out.println(isConcat.apply(2,3));//23
    //void method 
    Consumer<List<Student>> printStudent = students -> {
      for (Student std : students) {
        System.out.println("Student ID= "+std.getID());
      }
    };
    printStudent.accept(new ArrayList<>(List.of(new Student(2, "John"),new Student(3, "Mary"))));
  }

  public static boolean testM (int x){
      return x > 20;
  }

  public static String convert(Integer x, Integer y){
    return String.valueOf(x).concat(String.valueOf(y));
  }
}
