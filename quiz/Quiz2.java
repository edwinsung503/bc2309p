package quiz;

public class Quiz2 {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder ("abc");
    boolean bool = s.append("def").toString().startsWith("def");
    System.out.println(s);
    System.out.println(bool);
  }
}
