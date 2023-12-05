package methods;

public class ChainMethodCheckedException {

  public static void main(String[] args) {
    //main -> A -> B ->C
    //C throw checked Exception
    //A & B do not handle it -> throw 再俾上一手去
    //main handle it by try catch
    try {
      methodA(20);
    } catch (Exception e) {

    }
  }
  public static int methodA(int x ) throws Exception{
    return methodB(x);
  }

  public static int methodB(int x ) throws Exception{
    return methodC(x,4);
  }

  public static int methodC (int x ,int y) throws Exception{
    try {
      return x/ y ;
    } catch (ArithmeticException e ){
      throw new Exception();
    }
  }
}
