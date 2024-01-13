package com.bootcamp.javacode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD) 
// by default 有 ,唔使寫都會按method 去行
//per method -> before each
//per class -> before all
public class TestInstanceTest {
  
  private int x;

  private List<String> strings;

  @BeforeEach
  //mark a method that shd run before each test method
  void init () {
    this.x = 20;
  }
  
  @AfterEach
  void afterallTest(){
    System.out.println("hello...after all test");
  }

  @Test
  void testMethod1() {
    x++;
    assertEquals(21,x);
  }

  @Test
  void testMethod2() {
    x++;
    assertEquals(21,x);
  }
  // 每run 1次 都會重新new 一個object, 所以每次都係x = 1
  

  public static void main(String[] args) {
    TestInstanceTest t1 = new TestInstanceTest();
    t1.testMethod1();

    TestInstanceTest t2 = new TestInstanceTest();
    t2.testMethod2();
  }


}
