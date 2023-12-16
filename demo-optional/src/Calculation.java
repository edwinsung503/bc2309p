import java.util.Optional;

public class Calculation {
 //錯誤示範
 //Never use Optional<T> as input parameter for methods
  public static void main(String[] args) {
    Integer i1 = null;
    Integer i2 = 2;
    Integer result = add(Optional.ofNullable(i1),Optional.ofNullable(i2));//null +2 -> 2
    Integer result2 = add(null,null);// throw IAE
  }

  //Design NOT OK, you have to handle null scenario for both Optional Object 
  //and the object inside the Optional object
  public static Integer add(Optional<Integer> x, Optional<Integer> y){
    if (x == null || y == null){
      throw new IllegalArgumentException();
    }
    //有個hub 個hub 唔係Null
    //個hub 入面裝住2個null
    int xValue = 0;
    if (x.isPresent()){
      xValue = x.get();
    }
    int yValue =0;
    if (y.isPresent()){
      yValue = y.get();
    }
    return xValue + yValue;
  }


}
