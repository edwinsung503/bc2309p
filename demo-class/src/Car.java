public class Car {
  
  String make;

  String model ;

  String year;

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(String year) {
    this.year = year;
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
  }

}
