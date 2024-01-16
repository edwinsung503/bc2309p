package com.bootcamp.javacode;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals; // add 'static' + '.*'/ '.assertEquals'
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.Staff;

//File name has to be XXXXTest.java or XXXXTests.java
// Otherwise, mvn cannot locate the test files.
@DisplayName("Calculators Test Plan")
public class CalculatorsTests {

  @Test
  @DisplayName("Test add Function")
  public void testAdd(){
    assertEquals(7, Calculators.add(3,4));
    assertEquals(-11, Calculators.add(-1,-10));
    assertEquals(0, Calculators.add(0,-0));
    assertEquals(5, Calculators.add(8,-3));
    assertNotEquals(-5, Calculators.add(8,-3));

    String str = null;
    assertNull(str);

    //assertNull(Calculators.add(3, 4));
  }

  @Test
  @DisplayName("Test sort Function")
  public void testSort() {
    //Assertions.assertEquals(new ArrayList<>(List.of(1,2,3)), Calculators.sort(new int [] {3,2,1}));
    assertEquals(new ArrayList<>(List.of(1, 2, 3)),Calculators.sort(new int[] {2, 3, 1}));
    assertEquals(new ArrayList<>(List.of(-2, -1, -1)), Calculators.sort(new int[] {-1, -2, -1}));
    assertEquals(new ArrayList<>(List.of(0)), Calculators.sort(new int[] {0}));
      
        assertArrayEquals(new int[] {2, 3, 1},new int[] {2, 3, 1});
        //assertEquals(new int[] {2, 3, 1},new int[] {2, 3, 1}); 因為會check object not value
  }
  @Test
  @DisplayName("Test Deduct Function")
  public void testDeduct(){
    assertEquals(8, Calculators.deduct(10, 2));
  }
  
  @Test
  public void testBoolean() {
    assertTrue(5 > 3);
    assertFalse(5 < 3);

    Staff staff = new Staff ("John",30);
    assertTrue(staff.isAdult());//trure
    Staff staff2 = new Staff("Mary", 17);
    assertFalse(staff2.isAdult());//false
  }

  @Test
  public void testSameObject() {
    String s = "hello";
    String s2 = "hello";

    assertSame(s, s2);

    String s3 = new String ("hello");
    assertNotSame(s2, s3);
  }
  @Test
  public void testThrow() {
    assertThrows(NullPointerException.class, () -> {
      String nullString = null ;
      nullString.length();
    });

    assertDoesNotThrow( () -> {
      System.out.println("hello");
    });

    assertTimeout(Duration.ofMillis(2000), ()-> {
      Thread.sleep(1500);
    });

  }
  @Test
  public void testA(){
    assertTrue (10 > 5);
  }

  @Test
  public void testB() {
    assertEquals(5,"Hello".length());
  }

  // All assertion in assertAll must be pass.
  // @Test
  // public void combineTestAandTestB() {
  //   assertAll( () -> assertTrue (10 > 5), () -> assertEquals(5,"Hello".length())); // Expected [5] but was [6 ]
  // }
  


}
