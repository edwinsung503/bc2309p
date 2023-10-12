package Aninmal;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Cat extends Animal{
  //method 

  public String sound(){
    return "Meow";
  }

  private String name;

  private int age;

  private String color;

  public Cat(double height, double weight, String name,int age, String color){
    super(height, weight);
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String toString() {//String format
    return "Cat "+this.name+" is "+this.color+ " in color, and it is "//
    +this.age+" years old with "+super.toString();
  }
  public static void main(String[] args) {
    Cat cat = new Cat(12.1,2.4,"Kitty",2,"Grey");
    System.out.println(cat);

  }
  
}
