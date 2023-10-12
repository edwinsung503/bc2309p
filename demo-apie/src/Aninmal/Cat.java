package Aninmal;

public class Cat extends Animal{
  //method 

  public String sound(){
    return "Meow";
  }

  private String name;

  private int age;

  private String color;

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
  }
  
}
