package javaFunctionalInterface;

import java.util.function.BiPredicate;
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


  }
}
