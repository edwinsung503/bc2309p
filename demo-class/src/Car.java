public class Car {
  
  String make;

  String model ;

  String year;

  //如果唔寫empty construction, java 會auto 幫你起一個
  //Empty Constructor of Car
  //After "new Car()" , the 3 instance variable do exists inside the object
  public Car() {

  }
  //Constructor Signature cannot be duplicated
  //all-arguements constructor
  public Car(String make, String model, String year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public Car (String make, String model) {
    this.make = make;
    this.model = model;
  }
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getMake() {
    return this.make;
  }
  public static void main(String[] args) {
    Car c1 = new Car();//object is created in heap//a - old object 會被消失因為有同一個名的object, 無一支針指住佢
    c1 = new Car();//new object
    //c1 (with memory address) -> found the object location - > C1 係好快揾到object 的指路人
    //use the method inside the object oset value, then "abc" is assigned into 
    c1.setMake("abc");
    c1.setModel("xyz");
    c1.setYear("2020");

    //within this backet , 入面行的object 會被消失 - > 慳ram
    Car c2 = new Car();
    System.out.println(c2.getMake()); //null因為無set 
    c2.setMake("abc");
    System.out.println(c2.getMake());//abc

    Car c3 = new Car("cba","ijk","2023");
    System.out.println(c3.getMake());//cba

    Car c4 = new Car ("cba2","Totya");
    System.out.println(c4.getMake());//cba2

    



  }

}
