import javax.print.DocFlavor.INPUT_STREAM;

public class IntegerTest {
  public static void main(String[] args) {
    Integer i1 = 127;// auto-box
    System.out.println(i1.equals(127));//true , if you want to compare the value of i1
    System.out.println(i1==127);//true , i1 係咪指住127 個object

    Integer i2 = 128;
    System.out.println(i2 == 128);//true

    Integer i3 = 127;//
    System.out.println(i1 == i3);//true

    Integer i4 = 128;//< -128 - 127 都有internal cache 
    System.out.println(i2 == i4);//false ??!!
    //> 原因cache 只可以係由-128 to 127, 所以如果over 依個range , - > 就要開返個新object

    //Internal Cache (Byte, Short, Integer, Long) <- -128 - 127

    String str1 = "hello";
    System.out.println(str1 =="hello"); //true
    //Integer : valueOf vs new
    Integer i5 = 5;
    Integer i6 = new Integer(5);//diff ; 用多左位置
    Integer i7 = Integer.valueOf(5);//diff - > 睇有無重覆
    //因為java 有reuse 機制(within range)，所以佢會用cache 機制
    Integer i8 = Integer.valueOf(5); // i8 will resue the object of i7

    Long l1 = 3L;//auto-box
    Long l2 = Long.valueOf(3);//converstion -> upcast int - > Long - > long
    Short s1 = Short.valueOf("3"); //int - > short XXXX
    Short s2 = Short.valueOf((short)3);

    double d1 = Double.valueOf(3.4f); //float - > double - > Double
    float f1 = Float.valueOf((float)3.5d);

    
    
  }
  
}