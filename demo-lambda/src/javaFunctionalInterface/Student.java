package javaFunctionalInterface;

public class Student extends Person{
  
  private int id;

  public Student(int id,String name){
    super(name);
    this.id = id;
  }

  public int getID(){
    return this.id;
  } 
  
}
