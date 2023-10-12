package Aninmal;

public class Dog2 extends Mammal{
  //3.class has to implement all abstract methods
  //public abstract void sound();

  private String name;

  public Dog2 (String name, double weight, double height){
    super (weight, height);
    this.name =name;
  }
  public Dog2() {
    //super(); 因為會call empty consturctor ,所以唔使寫super

  }//任何(even empty  )constructor 都會call super
  @Override//documentation 或同complier 溝通去check 繼承的關係
  //幫你去睇個parent 有無依個method
  public void sound() {//sound 依個method , 佢父母(Mammal) 係有, complier 幫手去check 有無  
    System.out.println("break ....");
  }

  public static void main(String[] args) {
    Dog2 dog2 = new Dog2();
    System.out.println(dog2.getHeight());//0.0
    
  }
}

  //abstract class vs class 的difference
  //constructor 唔可以繼承, 但要互相去call , child call parent call grand parent
  //abstract class 有abstract method 但要去終結
  //鎖住佢唔俾人new 個object 會改到件事
  //