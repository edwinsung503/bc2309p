package shape;

import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {
  
  abstract double area();
  //similar to compareTo
  public static <T extends Shape> double totalArea(List<T> shapes){
    BigDecimal total = new BigDecimal(0);
    for (T s : shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));
      // < new a Object-> 要揾個object ref 接住佢
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.totalArea(List.of(new Circle(1.0),new Square(2.0))));//7.141592653589793
  }
}
