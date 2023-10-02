import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTestExe {
  public static void main(String[] args) {    
    double d1 = 0.2;
    double d2 = 0.4;

    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.4");
    BigDecimal bd3 = BigDecimal.valueOf(d1);

    BigDecimal result1 = bd1.subtract(bd2);//-0.2
    BigDecimal result2 = bd1.multiply(bd2);//0.08
    BigDecimal result3 = bd1.add(bd2);//0.6
    BigDecimal result4 = bd1.divide(bd2);//0.5

    System.out.println(result1.doubleValue());
    System.out.println(result2.doubleValue());
    System.out.println(result3.doubleValue());
    System.out.println(result4.doubleValue());
    System.out.println(BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue());//0.6
    System.out.println(new BigDecimal(d1).multiply(new BigDecimal(d2)).doubleValue());//0.08000000000000002
    System.out.println(new BigDecimal("0.5").multiply(new BigDecimal("0.2")).doubleValue());//0.1
    System.out.println(BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(d2)).doubleValue());//0.08

    int comparison = result1.compareTo(result4);//
    if (comparison > 0) 
      System.out.println("result1 is greater than result4");
    else if (comparison < 0)
      System.out.println("result1 is smaller than result4");//print
    else 
      System.out.println("result1 is equal to result4");

    System.out.println(BigDecimal.valueOf(10.1252).setScale(2,RoundingMode.UP));//10.13
    System.out.println(BigDecimal.valueOf(11.2576).setScale(2,RoundingMode.DOWN));//11.25

    
  
  }

}
