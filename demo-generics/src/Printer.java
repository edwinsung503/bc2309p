import java.util.ArrayList;
import java.util.List;

public class Printer<T> {
  
  //自己寫generic
  T x;//T > 俾任何的type , 等用家使用, 到時先要入type
  //幫你寫少左個class < KeyPoint

  public Printer (T x){
    this.x =x;
  }
  public Printer (){}

  public void setX (T x){
    this.x = x;
  }

  public T getX(){
    return this.x; 
  }
  public static void main(String[] args) {
    Printer<String> printer1 = new Printer<>();
    Printer<Integer> printer2 = new Printer<>();
    Printer<Double> printer3 = new Printer<>();

    //bf4 Java 1.5
    List objects = new ArrayList<>();
    //唔想1個List 放唔同的type
    //以下唔可以.method 因為放入去係無type
    objects.add("abc");
    objects.add(1);
    objects.add(1.0);
    System.out.println(objects);

    if ( objects.get(0) instanceof String) {
      String str = (String) objects.get(0);
      str = str.concat("abc");
    }

    //after Java 1.5

    

  }

}
