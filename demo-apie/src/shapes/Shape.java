package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

//有什麼class 唔可以俾繼承? -> Final 左的class , eg. String/integer 唔可以extend 
//abstract -> X new object
//abstract -> HV constructor for child class call
//abstract -> 唔需要人知個method 點做


public abstract class Shape {

  private Color color;

  public static Shape [] shapes;//create a arrayList

  static {//放個長度, 咁做可以慳memory 因為before complie time 
    shapes = new Shape[10];
  }// Shape [] shapes = new Shape [10];

  public static void add(Shape shape) {
    //add shape into shapes
    for (int i=0; i< shapes.length;i++) {
      if (shapes[i] ==null) {
        shapes[i] = shape;
        return;
      }
    }
  }

  abstract double area(RoundingMode mode, int dp);

  public Shape (Color color){
    this.color = color;
  }
  
  public Color getColor(){
    return this.color;
  }
  public static double totalArea(Shape[] shapes){
    BigDecimal total = new BigDecimal(0.0);
    for (int i =0 ; i< shapes.length; i++){
      if (shapes[i] !=null) {
        total = total.add(BigDecimal.valueOf(shapes[i].area(RoundingMode.FLOOR,2)));//-> shapes[i].area -> Polymorphism
        //total.add -> 會起一個新object -> total = total.add -> total 指住一個新object

        // total.add(BigDecimal.valueOf(shapes[i].area(RoundingMode.FLOOR,2))); -> 0.0 
        //因為指住 0.0 ->  total.add 完無野收住, 無接住-> total (object reference) -> 用返0.0 -> 除非要用total = total.add 用total 接住新object

        //個method 唔需要再修改, 因為夠用
        //只係要extend shape with new object like rectangle/
      }
    }
    return total.doubleValue();//178.53
  } 

  public static void main(String[] args) {
    //new 2 Circle and 1 Square , and put them into the Shape []
    Circle c1 = new Circle(2, Color.BLACK);
    Circle c2 = new Circle(4, Color.BLUE);
    Square s1 = new Square(5, Color.WHITE);
    Rectangle r1 = new Rectangle(2, 5, Color.BLACK);
    Trapezoid t1 = new Trapezoid(2, 4, 2, Color.WHITE);
    
    Shape.add(s1);
    Shape.add(c1);
    Shape.add(c2);
    Shape.add(r1);
    //Shape.add(t1);
    //runtime 先決定 run 那一個method (circle or square)

    System.out.println(Shape.totalArea(shapes));
    //103.82



  }
}
