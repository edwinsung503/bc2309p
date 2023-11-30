import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal implements Comparable<Animal>{
  //compare 其他 object

  private int age;
  
  public Dog(){
    //super
  }

  public Dog(String name, int age){
    super(name);
    this.age = age;
  }

  //public static void makeSound(Printer<Animal> animals){
//
  //}
  public static <T extends Animal> void makeSound (Printer<T> animals){

  }
  @Override
  public int compareTo(Animal animal){
    return animal.getName().compareTo(super.getName());
  }

  @Override 
  public String toString(){
    return "Dog: (Age="+this.age+" Name= "+this.getName();
  }
  //<T extends Animal> -> 俾range
  //Printer<T> animals-> 只要係animal 或animal 以下的object 

  //public static void makeSound(Printer<Dog> animals){
  //
  //}
  public static void main(String[] args) {
    Printer<Animal> printer1 = new Printer<>();
    Printer<Dog> dogPrinter = new Printer<>();

    //animalPrinter = dogPrinter ; -> cannot be polymorhism
    // 因為Printer 無extend dog / animal , 只係dog extend animal

    Printer <String> StrnigPrinter = new Printer<>();
    //Dog.makeSound(StringPrinter); -> Not Ok, T shd be in Animal Range
    Printer<Dog> dogPrinter2 = new Printer<>();
    Dog.makeSound(dogPrinter2);//OK

    List<Dog> arr = new ArrayList<>();
    Collections.sort(List.of(new Dog("ABC", 17),new Dog("BDC", 19)));
  }

  
}
