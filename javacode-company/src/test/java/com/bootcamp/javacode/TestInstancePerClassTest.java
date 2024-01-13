package com.bootcamp.javacode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)// 有用係spring boot
//唔會new 1個新object , 所以x = 2
@TestMethodOrder(OrderAnnotation.class)
public class TestInstancePerClassTest {

  private int x;

  @BeforeAll // before all

  void init () {
    this.x = 10;
  } 

  @AfterAll
  void afterallTest(){
    System.out.println("hello...after all test");
  }

  @Test
  @Order(2)
  void testA(){
    this.x++;
    assertEquals(12,this.x);
  }
  
  @Test
  @Order(1)
  void testB(){
    this.x++;
    assertEquals(11,this.x);
  }
  
  public static void main(String[] args) {
    TestInstancePerClassTest instancePerClassTest = new TestInstancePerClassTest();
    instancePerClassTest.testA();// become 1
    instancePerClassTest.testB();// become 2
  }
}
