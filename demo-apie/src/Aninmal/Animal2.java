package Aninmal;

public abstract class Animal2 {//< new 唔到依個class 的object,令件事少D野
  private double weight ;
  private double height ;

  public Animal2 () {
    //empty constructor < abstract class 唔可以繼承constructor
    // constructor 被Mammal 同dog2做因為繼承(extends)

  }

  public Animal2 (double weight , double height ) {//
    this.height=height;
    this.weight = weight;
  }

  public abstract void sound();//abstract class 可declar 唔係abstract class
  //因為animal2係abstract class , 所以可以寫abstract implenmetation
  //如果唔係abstract class 就唔可以寫abstract

  //2.abstract class can be with abstract method or normal method
  //but class does not have abstract method,


  public void sound2() {
    System.out.println("zzz...");
  }
  public double getHeight(){
    return this.height;
  }
  public double getWeight(){
    return this.weight;
  }

  public static void main(String[] args) {
    //Difference between class and abstract class

    //1.class can new obejct, but abstract class cannot new object
    Animal animal =  new Animal(13.0d, 20.3d);
    //Animal2 animal2 = new Animal2(); -< cannot new an object

    //abstract class 唔可以new a object -> 有無constructor ??
    //
  }
  
}
