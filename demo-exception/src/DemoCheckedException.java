public class DemoCheckedException{

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
    //1.ArithmeticException (/ by zero)
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
  }

  public static int  sum(int x1, int x2) throws Exception{
    if(x1 >= 0 && x2 >=0) {
      return x1 + x2;
    }
    throw new Exception();//要人handle依個method

  }


}