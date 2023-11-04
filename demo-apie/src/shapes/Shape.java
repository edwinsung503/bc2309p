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

  public void setColor (Color color){
    this.color = color;
  }



  public static double totalArea(Shape[] shapes){//放入去的objects 係extend 緊shape
    BigDecimal total = new BigDecimal(0.0);
    for (int i =0 ; i< shapes.length; i++){
      if (shapes[i] !=null) {
        // shapes[i].area -> polymorphism
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
  //interface/ parent class 去實踐 polymorhishm
  public static void main(String[] args) {
    //new 2 Circle and 1 Square , and put them into the Shape []
    //Circle c1 = new Circle(2,Color.BLACK);
    Circle c1 = Circle.of(3.0, Color.BLACK);

    //Circle c2 = new Circle(4, Color.BLUE);
    Circle c2= Circle.of(3, Color.BLUE);
    //why 可以放3.0/ 3 都可以?? 3-> 3.0 因為upcast
    //本身入int 但radius type 係double -> 因為upcase 左
    Square s1 = new Square(5, Color.WHITE);
    

    Rectangle r1 = new Rectangle(2, 5, Color.BLACK);
    Trapezoid t1 = new Trapezoid(2, 4, 2, Color.WHITE);
    
    Shape.add(s1);
    Shape.add(c1);
    Shape.add(c2);  
    Shape.add(r1);
    Shape.add(t1);
    //runtime 先決定 run 那一個method (circle or square)

    System.out.println(Shape.totalArea(shapes));
    //103.82

    Shape s2 = Circle.of(5.0, Color.WHITE);// static method call constructor
    ////create a self constructor at Square to  call constructor
    Shape s3 = Square.valueOf(4.9,Color.BLACK);

    //static method 放邊到(其他file)
    //instane method 有this 的concept -> 只可以放係同class name 的File




  }
}
