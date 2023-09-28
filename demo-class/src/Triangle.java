import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class Triangle {
  //Once it is created, it's based & height cannot revised
  //length * height / 2

  double length;
  double height;
  //setter
  public void setLength(double length) {
    this.length = length;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  //constructor
  //public Triangle() {
  //}

  public Triangle(double length, double height) {
    this.height = height;
    this.length = length;
  }

  public double area () {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.height))//
            .divide(BigDecimal.valueOf(2)).doubleValue();

  }

  public static void main(String[] args) {
    //approach 1
    Triangle t1 = new Triangle(2.1, 3.1);//new object in heap
    System.out.println(t1.area());
    //用setter 去俾人必須
    //唔用setter 唔俾人去修改
    // empty constructor 且setter 的用途同
    // setter 

    Triangle t2 = new Triangle(2.0, 4.0);
    System.out.println(t2.area());

    //Case 1 , 用一個setter 
    //Case 2 , 唔用setter
    //Case 3 empty constructor
