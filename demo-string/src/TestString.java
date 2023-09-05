public class TestString {
  public static void main (String[]args) {
    String str = "abc";
    // equals() -> method 
    // String  - > 使用一D 工具 - > equal
    // String can use methods
    // abc . equal type
    // boolean result = "abc".equals(str);<< boolean 
    //"abc".equals(str);<< boolean 
    boolean result = "abc".equals(str);//<< boolean -b> abc is a string
    if (result) { // if (result == ture)
      System.out.println("it is abc");
    }
    if ("abc".equals(str)) { // 
      System.out.println("it is abc");
    }
    // String 的長度
    if ("abc".length() == 3) {
      System.out.println("length = 3");
    }
    if (str.length() == 3) {
      System.out.println("length = 3");
      System.out.println(str.length()); // return integer value
    }

    // str - > "abc", 
    //'a' at the position [0]
    //'b' at the position [1]
    //'c' at the position [2]
    // [3] ??
    if (str.charAt(0) == 'a') {// char at position [0] - > 'a'
      System.out.println("charAt 0 in String str is a");
    } 

    if (str.charAt(1) == 'b' || str.length() < 3) {//true
      System.out.println("ok");
    }

    float f1 = 100.3f;
    long l1 = 22000000000L; // 
    double d1 = 0.5; // 0.5d
    byte b1 = 127;
    short b2 = 32000; 
    // convert int 320000 to short 32000 
    //assign shrot 32000 to s1
    short s1 = 32000;

    //switch
    // 無and or case 就用 switch






  }
}