package revision;

public class Phone {

  private String model;

  private int price;

  public Phone (String model, int price){
    this.model = model;
    this.price = price;
  }
  
  public String getModel (){
    return this.model;
  }

  public int getPrice(){
    return this.price;
  }

  public void setModel(String model){
    this.model = model;
  }
  public void setPrice (int price){
    this.price = price;
  }

  @Override
  public String toString(){
    return "(Name = "+this.model+" Price = "+this.price+" )";
  }
}
