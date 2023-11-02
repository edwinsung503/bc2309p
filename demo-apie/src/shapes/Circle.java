package shapes;

import java.util.Objects;
import enums.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{
  
  private double radius ;//<- Encapsulation radius 因為private 左 

  //double = * ?
  //getter, setter
  //consructor
  //equals(), hascode, toString

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public void setColor(Color color) {
    super.setColor(color);//cirecle 入面object - shape 依附circle, 如果繼承时係call 返shape 入面的method
    //this.radius += 1.0;//may hv bug ->  BigDecimal to fix bug
    this.radius = BigDecimal.valueOf(this.radius).add(BigDecimal.ONE).doubleValue();
  }

  //getter / setter
  //double radius -> BigDecimal > 用家只知return value 係BigDecimal
  public BigDecimal getRadius(){
    return BigDecimal.valueOf(this.radius);
  }
  //用家唔需要知radius save 低係什麼type -> float / double

  //Encapsulation
  public static Circle of(double radius) {//overloading 1
    return new Circle(radius, Color.BLACK );  
  }
  public static Circle of(Color color) {//overloading 2 
    return new Circle(1, Color.BLACK );  
  }
  public static Circle of(double radius, Color color) {//overloading 3
    return new Circle(radius, color );  
  }

  public static Circle ofBlue (double radius){
    return new Circle(radius,Color.BLUE);
  }


  //> private Constructor -> 要用static method call 返 (of)
  private Circle (double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  public double getDiameter(){
    return this.radius * 2; //封裝: 佢唔知計法，只知ANS
  }

  @Override
  public double area(RoundingMode mode, int dp){
    BigDecimal bRadius = BigDecimal.valueOf(this.radius);
    BigDecimal bPi = BigDecimal.valueOf(Math.PI);
    //return bRadius.multiply(bRadius).multiply(bPi).doubleValue();
    return bRadius.multiply(bRadius).multiply(bPi).setScale(dp, mode).doubleValue();
    //try to solve adding rounding mode
    //BigDecimal.valueOf(mode,dp)
    //半徑X 半徑X PI -> rando
  }

  @Override
  public boolean equals(Object obj){

    if (this == obj) {//同一隻heap object -> true
      return true;
    }
    //It checks if obj is an instance of the Circle class, 
    //meaning it is a Circle object or a subclass of Circle. 
    //If no, it returns false, because they are not compatible types 
    //and cannot be equal.
    if (!(obj instanceof Circle)){//if it is a string -> false
      return false;
    }
    //It casts obj to a Circle object, meaning 
    //it converts its type from Object to Circle. 
    //This is necessary because the equals() method takes an Object parameter,
    //but we need to access the Circle-specific fields and methods.
    Circle circle = (Circle) obj;//obj downcase to class circle -> 轉TYPE
    //compare the radius of this object and obj
    // The Objects.equals() method is a static utility method that returns true 
    //if both arguments are null, or if they are equal according to their own equals() method. 
    //This way, it avoids null pointer exceptions and handles different types of arguments.
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
    Circle circle = new Circle(3.5,Color.BLACK);
    //System.out.println("cicle area=" +circle.area());//38.48451000647496
    //System.out.println(Math.round(circle.area()* 100)/ 100.0);
    //System.out.println(BigDecimal.valueOf(circle.area()).setScale(2, RoundingMode.HALF_UP));;
    System.out.println("cicle area=" +circle.area(RoundingMode.HALF_UP,2));//38.48451000647496

    Shape shape = new Circle(4, Color.WHITE);// shape 係收窄左範園- Object -> Shape
    System.out.println(shape.getClass());//->class shapes.Circle -> class 都係Circle
    //instanceof 可以拎到入面個class name

    //run-time 先知4 * 4 * 3.14....
    System.out.println(shape.area(RoundingMode.FLOOR,2));//4 * 4 * 3.14....
    //-> refer 到Circle 入面的method


    Circle circle2 = Circle.ofBlue(5);//encaplate 左, 封裝係唔使佢識咁多野
    //要用家舒服
    //唔使知道blue 係什麼, eg StringBox入面唔使知係string array

    //Overloading
    Circle circle3 = Circle.of(Color.WHITE);
    Circle circle4 = Circle.of(3.9);
    Circle circle5 = Circle.of(3.9, Color.BLACK);

    //valueOf() -> static Method -> String.valueOf()
    String str = String.valueOf(1);//1
    String str2 = String.valueOf('1');//'1'
    String str3= String.valueOf(true);// "true"
    //用家放什麼入去都會出string, 唔使用家記咁多野

    
    //abstract class -> 要入哂
    //interface + inheritance <- base
    //
    
  }
}
