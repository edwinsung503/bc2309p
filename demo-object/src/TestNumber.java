public class TestNumber {
  
  public static void main(String[] args) {
    Object x = 100;
    Integer x2 = 100;//Integer.class extends Number extends Object.class 
    //class 放左final , 個class 唔可以再extend
    //任何class 都可以extend

    //Number 係abstract class 唔可以new

    //Number n =3;
    Number n = Integer.valueOf(100);
    n = Double.valueOf(10.3d);//double extends number

    n = Long.valueOf("10");

    if (n instanceof Integer) {
      Integer integer = (Integer) n;//downcase 就係integer
      System.out.println("Integer: "+integer.intValue());
    } else if (n instanceof Double) {
      Double double2 = (Double) n;
      System.out.println("Double: "+double2.intValue());
    } else if (n instanceof Long) {
      Long long2 = (Long) n;
      System.out.println("Long: "+long2.intValue());
    } else if (n instanceof Float) {
      Float float2 = (Float) n;
      System.out.println("Float: "+float2.intValue());
    }


  }
}
