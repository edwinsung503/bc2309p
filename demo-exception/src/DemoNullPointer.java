public class DemoNullPointer {
  
  public static void main(String[] args) {
    String s = null;
    charAt(s);//java.lang.NullPointerException
  }

  public static void charAt(String s){
    s.charAt(s.length()-1);//error
    //You should fix the program directly
    //instead of using try catch to handle various scenario
  }
}
