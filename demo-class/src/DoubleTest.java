import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {
  public static void main(String[] args) {
    double d1 = 0.1;
    double d2 = 0.2;

    System.out.println(d1+d2);//0.30000000000000004
    System.out.println(d2-d1);//0.1
    System.out.println(d1*d2);//0.020000000000000004
    System.out.println(0.3-0.1);//0.19999999999999998 - > 唔fix 因為損失速度,所以ignore
    //Double 同float 都有相同問題 - > Soultion : BigDecimal
    //BigDecimal

    BigDecimal bd = new BigDecimal(d1); 
    //> bd is a object reference
    //new BigDecimal -> Object
    BigDecimal bd3 = new BigDecimal(String.valueOf("0.2"));//用String.valueOf 轉做double
    BigDecimal b = new BigDecimal("0.3");//唔理佢入面的primiitive 
    BigDecimal bd2 = new BigDecimal("0.1");//-0.1
    BigDecimal result = b.subtract(bd2);//2個都要用string 先唔會出事

    System.out.println(result.doubleValue());

    BigDecimal bd4 = new BigDecimal("0.4");
    BigDecimal bd5 = new BigDecimal("0.2");

    BigDecimal result1 = bd4.multiply(bd5);//0.08
    BigDecimal result2 = bd4.divide(bd5);//2.0
    BigDecimal result3 = bd4.add(bd5);//0.6

    System.out.println(result1.doubleValue());//returns the value of a number object as a double data type
    System.out.println(result2.doubleValue());
    System.out.println(result3.doubleValue());

    System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));//

    int comparison = bd4.compareTo(bd5);
    if(comparison > 0) 
      System.out.println("bd4 is greater than bd5");//print
    else if (comparison < 0) 
      System.out.println("bd4 is smaller than bd5");
    else
      System.out.println("bd4 is equal to bd5");


    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)));//0.2

    //new or valueOf()
    BigDecimal bd6 = BigDecimal.valueOf(10.45678).setScale(2, RoundingMode.UP);// 2個小數位再round up
    System.out.println(bd6);//10.46
    BigDecimal bd7 = BigDecimal.valueOf(10.4527).setScale(3, RoundingMode.DOWN);//10.452
    System.out.println(bd7);

    if (bd5.equals(bd7))
      System.out.println("bd5 is equal to bd7");
    else 
      System.out.println("bd5 is not equal to bd7");//print

    
  }
}
