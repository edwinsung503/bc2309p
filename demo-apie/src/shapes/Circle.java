package shapes;

import java.util.Objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{
  
  private double radius ;

  //double = * ?
  //getter, setter
  //consructor
  //equals(), hascode, toString

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius () {
    return this.radius ;
  }

  public Circle (double radius) {
    this.radius = radius;
  }

  @Override
  public double area(RoundingMode mode, int dp){
    BigDecimal bRadius = BigDecimal.valueOf(this.radius);
    BigDecimal bPi = BigDecimal.valueOf(Math.PI);
    return bRadius.multiply(bRadius).multiply(bPi).doubleValue();
    //try to solve adding rounding mode
    //BigDecimal.valueOf(mode,dp)
    //半徑X 半徑X PI -> rando
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) {//同一隻heap object -> true
      return true;
    }
    if (!(obj instanceof Circle)){//if it is a string -> false
      return false;
    }
    Circle circle = (Circle) obj;//obj downcase to class circle
    return Objects.equals(circle.getRadius(), this.radius);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.radius);
  }

  @Override
  public String toString() {
    return "Circle (Radius="+this.radius+")";
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.5);
    System.out.println("cicle area=" +circle.area());//38.48451000647496
    System.out.println(Math.round(circle.area()* 100)/ 100.0);
    System.out.println(BigDecimal.valueOf(circle.area()).setScale(2, RoundingMode.HALF_UP));;

    
  }
}
