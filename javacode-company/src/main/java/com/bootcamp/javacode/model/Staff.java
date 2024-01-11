package com.bootcamp.javacode.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
//@EqualsAndHashCode //--> 現在只會check age , 所以唔改age 唔會當唔同,因為call 左super
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@SuperBuilder

public class Staff extends Person {
  
  //private String name;

  private int age;

  public Staff (String name, int age){
    super(name);
    this.age = age;
  }

  // public Staff (String name, int age){
  //   this.name = name;
  //   this.age = age;
  // }

  // public String getName(){
  //   return this.name;
  // }
  // public int getAge(){
  //   return this.age;
  // }
  
  // public void setName(String name){
  //   this.name=name;
  // }
  // public void setAge(int age){
  //   this.age = age;
  // }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John",12);
    System.out.println(staff.getAge());
    staff.setAge(12);

    //no arg constructor-> create instances without providing inital value 
    Staff staff2 = new Staff();
    
    // System.out.println(staff.toString());
    // toString()
    System.out.println(staff);
    // equals
    Staff staff3 = new Staff("John",12);
    System.out.println(staff.equals(staff3));//true
    // hashcode
    System.out.println(staff.hashCode());//2318728
    System.out.println(staff3.hashCode());//2318728

    Staff staff4 = Staff.builder()//
              .name("Mary") //            
              .age(39)//
              .build();
    System.out.println(staff4);

    

  }
}
