package Aninmal;

public abstract class Mammal extends Animal2{
  // attributes

  public abstract void sound();// 因為佢唔係一個class, 佢係一個abstract class, 所以佢係唔使終結佢

  public Mammal (double weight, double height) {

  }

  public Mammal () {}

  public static void main(String[] args) {
    Dog2 dog2 =new Dog2();
    dog2.sound();

    SmallDog smalldog = new SmallDog();
    smalldog.sound();
    //通常最多2-3個layer
  }
}
