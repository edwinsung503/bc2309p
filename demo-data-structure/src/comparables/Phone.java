package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone implements Comparable<Phone>{

  private String model ;
  private double price;

  public double getPrice() {
    return this.price;
  }

  public Phone(String model, double price){
    this.model = model;
    this.price = price;
  }
  @Override
  public String toString (){
    return "Iphone model = "+this.model+", Price = "+this.price;
  }
  @Override
  public int compareTo(Phone phone){
    if (phone.getPrice() > this.price){
      return -1;
    }
    return 1;
  }

  public static void main(String[] args) {
    List<Phone> phones = new ArrayList<>(List.of(new Phone("iphone 13",199),new Phone("iphone 15",1199),new Phone("iphone 12",179)));

    Collections.sort(phones);
    System.out.println(phones);
  }
  
}
