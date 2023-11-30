package shape;

import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {
  
  abstract double area();
  //similar to compareTo
  public static <T extends Shape> double totalArea(List<T> shapes){
    BigDecimal total = new BigDecimal(0);
    for (T s : shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));// 要拎area()-> 只可以係Shape 到揾又多個class 放入去
      // BigDecimal -> == new a Object-> 要揾個object ref 接住佢
    }
    return total.doubleValue();
  }
  public static double totalArea2(List<? extends Shape> shapes){
    //must be shape , 因為可以係circle , 因為shape 上面可以拎到square , 所以唔
    BigDecimal total = new BigDecimal(0);
    for (Shape s : shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));// 要拎area()-> 只可以係Shape 到揾又多個class 放入去
      // BigDecimal -> == new a Object-> 要揾個object ref 接住佢
    }
    return total.doubleValue();
  }
  public static void main(String[] args) {
    System.out.println(Shape.totalArea(List.of(new Circle(1.0),new Square(2.0))));//7.141592653589793

    //不論有幾多個shape , 都唔使再改, 只係加多幾個rectangle 的class
  }
}
