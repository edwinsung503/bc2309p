import java.math.BigDecimal;

public class Circle {
  double radius;
  String color;//use enum 去表達color 仲好

  //setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  //constructor
  public Circle (double radius,String color) {
    this.radius = radius;
    this.color = color;
  }

  public Circle() {}

  //area 
  public double area() {
    BigDecimal radius = BigDecimal.valueOf(this.radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    return radius.multiply(radius).multiply(pi).doubleValue();
  }

  public static void main(String[] args) {
    //new Circle
    Circle circle2 = new Circle();
    circle2.setRadius(3.2);
    circle2.setColor("red");
    System.out.println(circle2.area());
    circle2.setRadius(1.2);
    System.out.println(circle2.area());

    Circle circle1 = new Circle(3.2,"red");
    System.out.println(circle1.area());


  }

  
}
