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

    
  }
  
}
