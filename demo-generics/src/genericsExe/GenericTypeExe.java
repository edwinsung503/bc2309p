package genericsExe;

import java.util.Arrays;

public class GenericTypeExe<T> {
  
  private T t;

  public void setT(T t){
    this.t = t;
  }

  public T getT(){
    return this.t;
  }

  public static <T> GenericTypeExe<T> creat(T value){
    GenericTypeExe<T> arr21 = new GenericTypeExe<>();
    arr21.setT(value);
    return arr21;
  }

  public static void main(String[] args) {
    GenericTypeExe<String> string = new GenericTypeExe<>();
    string.setT("String");
    System.out.println(string.getT());
    GenericTypeExe<Integer> num = new GenericTypeExe<>();
    num.setT(100);
    System.out.println(num.getT());

    GenericTypeExe<int []> arr = new GenericTypeExe<>();
    arr.setT(new int []{1,2,4});
    System.out.println(Arrays.toString(arr.getT()));

    GenericTypeExe<String> arr10 = creat("John");
    System.out.println(arr10.getT());


  }

}
