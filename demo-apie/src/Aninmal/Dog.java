package Aninmal;

public class Dog extends Animal{

  public String sound() {
    return "WO WO";
  }
  //add name
  private String name;

  public Dog (double height,double weight,String name) {
    super(height , weight);//Super 永遠係第一句, 用super 去拎(因為繼承唔到constructor , 要用super)
    this.name =name;
  }
  public String toString () {
    return "Dog(name= "+this.name +", Animal(" +super.toString()+"))";//>> call (Parent object)Animal String toString
  }
<<<<<<< HEAD

  //super.toString (Parent constructor)
  // this. -> 形容自己的object
  //必須要寫因為有一日佢會有自己的attribute
=======
  //必須要寫(String toString)因為有一日佢會有自己的attribute
>>>>>>> fd9d0a98b0173077bd95eef535a48ad8119fe92e
  //public String toString() {
  //  return "weight+ "+super.getWeight() + " height= "+super.getHeight();
  //}
  //Dog 繼承左aninmal 的toString
  public static void main(String[] args) {
    Dog dog = new Dog(12.0d,13.0d,"Donki");
    //how to print dog
<<<<<<< HEAD
    System.out.println(dog);
    System.out.println(dog.getHeight());

=======
    System.out.println(dog);//因為寫左toString, 唔使再寫dog.toString
>>>>>>> fd9d0a98b0173077bd95eef535a48ad8119fe92e
    
  }
}
