import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box <T, U>{
  
  private T data;

  private U value;



  public Box (T data,U value){
    this.data = data;
    this.value = value;
  }
  public Box(){}

  public static <T,U> Box<T,U> createBox(T data, U value){
    //return type -> Box<T,U> 
    Box<T,U> box = new Box<T,U>(data,value);
    return box;
  }


  public static void main(String[] args) {
    Box<String,Integer> box1 = new Box<>("Hello",123);
    Box<Integer,Integer> box2 = new Box<>(124,122);
    Box<int[], int[]> box3 = new Box<>(new int[] {-10,2,199},new int[] {-1,2,19});

    Box< List<String>, Map<String,String>> box4 = new Box<>(List.of("abc","def"),new HashMap<>());

    Box<String,Integer> box5 = Box.createBox("Hello",23);
  }
}
