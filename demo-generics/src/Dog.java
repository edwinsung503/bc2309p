public class Dog extends Animal{

  private int age;

  //public static void makeSound(Printer<Animal> animals){
//
  //}
  public static <T extends Animal> void makeSound (Printer<T> animals){

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

  }

  
}
