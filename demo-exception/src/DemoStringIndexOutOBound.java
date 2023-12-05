public class DemoStringIndexOutOBound {
  
  public static void main(String[] args) {
    System.out.println(charAt("Result"));
    //java.lang.StringIndexOutOfBoundsException
  }

  public static char charAt(String s){
    return s.charAt(s.length());
    // You should fix the program directly
    // instead of using try catch to handle various scenario
  }
}
