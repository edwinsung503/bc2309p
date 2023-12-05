public class DemoUnCheckedException{

  public static void main(String[] args) {
    //unchecked exception
    //null pointer exception
    String s;
    try {
      s = null;
      System.out.println(s.length());//0 -> null pointer exception
    } catch (NullPointerException e){
      s= "";
    }
    //1.ArithmeticException (by zero)
    //2.NullPointerException  
    //Excpetion 可check(必須solve) / uncheck (no need solve)
    //Checked Exception-> before compile - 逼用家自己決定如果有exception 要點做
    int result ;
    int x = 0;
    if (x ==0) {
      result =1;
    } else {
      result = 10 /x ;
    }
    try {
      x = 0;
      result = 10 / x ;
      System.out.println(result); 
    } catch (ArithmeticException e) {
      result = 1;
    }
    //sum(2,3);//如果exception 就要點handle
    int result2;
    try {
      result2 = sum(2,4);
    } catch (Exception e) {
      result2 = -1;
    }
    // Example 1: ArithmeticException
    System.out.println(divided(9, 3));//3
    System.out.println(divided(2, 0)); // java.lang.ArithmeticException: / by zero

    try {
      //Since divided3 would throw a check exception
      //so the method caller has to handle the method call by try catch
      result = divided3(9, 3) ;
    } catch (Business1Exception e) {
      result = -1;//由用家決定如果有exception , 係會出什麼result
    }

    // Example 2:
    arrayIndexOutOfBound(new int[10]); // 
  }

  public static int  sum(int x1, int x2) throws Exception{
    if(x1 >= 0 && x2 >=0) {
      return x1 + x2;
    }
    throw new Exception();//要人handle依個method
  }

  // Example 1: ArithmeticException
  public static int divided (int x, int y){ // is it a must to catch ArithmeticException? No
    int result = x / y ;
    return result;
  }
  //The method signature need to "throws exception" if the logic throw checked exception
  public static int divided2 (int x, int y) {
    int result ;
    try {
      result = x/y;
    } catch (ArithmeticException e){
      result = 0; //Convert unchecked exception to checked exception
    }
    return result;
  }
  // The method signature need to add "throws exception" if the logic throw checked exception
  public static int divided3(int x, int y) throws Business1Exception {
    int result;
    try {
      result = x / y;
    } catch (ArithmeticException e) { // Convert uncheck exception to checked exception
      throw new Business1Exception();//我唔接, 上一手接LA->上1手再catch
    }
    return result;
  }

  public static void arrayIndexOutOfBound(int[] arr) {
    arr[arr.length] = 1;
  }


}