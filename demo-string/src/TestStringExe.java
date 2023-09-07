public class TestStringExe {
  public static void main(String[]args) {
    String texts = "Edwin";

    if ("Edwin".equals(texts)){
      System.out.println("I am Edwin");//I am Edwin
    }

    if (texts.length() >4){
      System.out.println("hello");//hello
      System.out.println(texts.length());//5
    }

    if (texts.charAt(2) =='w') {
      System.out.println("Win");//win
    }

    if (texts.charAt(1) =='d' || texts.length() < 3){
      System.out.println("Edwin Sung");//Edwin Sung
    }

    if (texts.charAt(2)!='d' && texts.length() >=5) {
      System.out.println("Peggy Chan");//Peggy Chan
    }
  }
}
