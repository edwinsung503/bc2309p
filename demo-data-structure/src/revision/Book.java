package revision;

public class Book {
  
  private String name;
  private double price;

  private Book (){

  }
  public Book (String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName (){
    return this.name;
  }

  public double getPrice (){
    return this.price;
  }
  //setter -> 可改寫之前的name 
  public void setName(String name){
    this.name = name;
  }

  public void setPrice(double price){
    this.price = price;
  }
  @Override
  public String toString(){
    return "Book (Name= "+ this.name + ", Price= "+this.price+" )";
  }


}
