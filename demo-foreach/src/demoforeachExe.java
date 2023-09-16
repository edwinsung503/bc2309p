import java.util.Arrays;

public class demoforeachExe {
  public static void main(String[]args) {
    int [] arrgs = new int [] {2,3,4,5,6} ;
    for (int num : arrgs) {
      System.out.println(num);
    }

    String [] strs = new String [] {"Good bye"} ;
    for (String sen : strs) {
      System.out.println(sen);
    }

    String [] stays = new String[] {"hello world"} ;
    for (String stay : stays ) {
      System.out.println(stay);
    }
  }
}
