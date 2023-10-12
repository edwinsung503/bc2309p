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

<<<<<<< HEAD
  public Cat(String name,int age,double height, double weight,String color) {
    super(height,weight);
    this.name= name;
    this.age =age;
    this.color = color;
  }

  public String tostring(){
    return "A "+this.color+" name= "+this.name+" age= "+this.age+"Animal"+super.toString();
    //return "Cat(name=)+this.age+", Animal("+
  }

  public static void main(String[] args) {
    Cat cat = new Cat("Kitty",4,1.2d,12.d,"grey");
    System.out.println(cat);
=======
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

>>>>>>> fd9d0a98b0173077bd95eef535a48ad8119fe92e
  }
  
}
