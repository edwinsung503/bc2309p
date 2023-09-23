public class IntegerTest {
  public static void main(String[] args) {
    Integer i1 = 127;// auto-box
    System.out.println(i1.equals(127));//true , if you want to compare the value of i1
    System.out.println(i1==127);//true , i1 係咪指住127 個object

    String str1 = "hello";
    System.out.println(str1 =="hello"); //true
  }
  
}
