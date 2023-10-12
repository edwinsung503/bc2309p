package Aninmal;

public class Animal {//abstract-> 抽象
  //abstract class vs normal class

  
  private double weight ;

  private double height;

  
  public void setHeight(double height){
    this.height = height;
  } 

  public void setWeight(double height){
    this.weight = weight;
  } 

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public Animal() {}

  public Animal (double height, double weight){
    this.height =height;
    this.weight = weight;

  }

  public String toString() {
    return "weight= "+this.weight +"height= "+this.height+"name= "; 
  }
}
