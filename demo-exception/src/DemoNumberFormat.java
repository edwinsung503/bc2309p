public class DemoNumberFormat {
  public static void main(String[] args) {
    int num = parseInt("1s");//java.lang.NumberFormatException-> runtime exception
    System.out.println("num= "+num);
  }
  public static int parseInt(String s){
   return Integer.parseInt(s); 
   //parseInt that takes a string as a parameter and returns an integer.
  }
}
