package genericsExe;

public class Dog extends Animal{

  private int run;

  public Dog (String name, int run){
    super(name);
    this.run = run;
  }

  public int getRun(){
    return this.run;
  }
  @Override
  public void makeSound(){
    System.out.println("WOW: "+getName());
  }

  public static void main(String[] args) {
    Dog dog = new Dog("peter", 10);
    dog.makeSound();
    Animal dog2 = new Dog("John", 10);
    dog2.makeSound();
  }

  
}
