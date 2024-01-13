package com.bootcamp.javacode;


import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class UpperCaseStringMatcher extends TypeSafeMatcher<String>{

  @Override
  protected boolean matchesSafely(String item) {
    //Define the condition: 
    //Check if the string contains only uppercase letters
    return item.matches("[A-Z]+");// regalur expression

  }

  @Override
  public void describeTo(Description description) {
    //used to generate failure messages when assertions fail
    description.appendText("A String containing only upper string.");

  }
  // static factory method for creating the matcher
  public static Matcher<String> containsUppercaseOnly(){
    return new UpperCaseStringMatcher();
  }
  

}
