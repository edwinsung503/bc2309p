package com.bootcamp.javacode.Hamcrest;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.bootcamp.javacode.UpperCaseStringMatcher;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.Person;
import com.bootcamp.javacode.model.Staff;

public class HamcrestTest {
  
  @Test
  void test(){
    assertThat(Calculators.add(3, 2), is(5));
    assertThat(Calculators.add(3, 2), is(not(6)));
    assertThat(Calculators.add(4,7), is(greaterThan (10)));
    assertThat(Calculators.add(4,7), is(not(greaterThan (11))));
  }

  @Test
  void testSring(){
    assertThat(Person.concat("world"), is("helloworld"));
    assertThat(Person.concat("world"), is(not("hello")));
    assertThat(Person.concat("world"), not("hello"));
    assertThat(Person.concat("world"), not(equalTo("hello")));
    assertThat(Person.concat("world"),containsString("hello"));

    String str = null;
    assertThat(str, is(nullValue()));
    
  }

  @Test
  void testObject (){
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, sameInstance(s2));
  }

  @Test
  void testAny() {
    int value= 50;
    assertThat(Calculators.add(50, 5),allOf(
      greaterThan(54),
      lessThan(56),
      greaterThanOrEqualTo(55),
      lessThanOrEqualTo(55)
    ));
  }

  @Test
  void testArrayList() {
    List<String> names = new ArrayList<>(List.of("John","Peter","Tommy")) ;
    assertThat(names, hasItem("John"));
    assertThat(names, hasItem("Tommy"));
    assertThat(names, not(hasItem("Mary")));

    assertThat(names,hasItems("John","Tommy"));

    assertThat(names,hasSize(3));
    assertThat(names,not(hasSize(4)));

    //contains () is checking ordering and items
    assertThat(names,contains("John","Peter","Tommy"));
    assertThat(names,not(contains("John","Tommy","Peter")));

    assertThat(names,containsInAnyOrder("John","Peter","Tommy"));
    List<String> emptyList = new ArrayList<>();
    assertThat(emptyList, empty());
    
  }

  @Test
  void testArray () {
    Integer [] arr = new Integer [] {2,4,7,11,8};
    assertThat(arr, arrayContainingInAnyOrder(2,4,8,7,11));
    assertThat(arr, arrayContaining(2,4,7,11,8));
    assertThat(arr, not(arrayContaining(2,8,7,11,4)));

    //int [] integers = new int [] {100,50,23};
    //assertThat(Arrays.asList(integers),hasItem(100));
  }

  @Test
  //check range
  void testTolerance() {
    double actual = 3.14159;
    double expected = 3.14;
    double delta = 0.01;
    assertThat(actual, closeTo(expected,delta));

    double actual2 = 3.135;
    assertThat(actual2, closeTo(expected,delta));

    double actual3 = 3.129;
    assertThat(actual3, not(closeTo(expected,delta)));
  }

  @Test
  void testObjectClass() {
    Object obj = new Staff("John",22) ;// upcast
    assertThat(obj,instanceOf(Staff.class));
  }

  @Test
  void testUppercaseMatcher() {
    String s1 = "HELLO";
    String s2 = "WORLD";

    assertThat(s1, UpperCaseStringMatcher.containsUppercaseOnly());
    assertThat(s2, UpperCaseStringMatcher.containsUppercaseOnly());
  }

}
