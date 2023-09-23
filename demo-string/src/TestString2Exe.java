import java.util.Arrays;

public class TestString2Exe {
  public static void main (String[]args) {
    int [] numbers = new int [] {1,2,3,4,5} ;
    for (int s : numbers) {
      System.out.println(s);
    }
    String [] strs =  {"Edwin","Helen","Milk","Jacky","Candy"};
    for (String ss:strs){
      System.out.println(ss);
    }
    
    String str = "Good morning" ;
    String [] set = str.split(" ");
    System.out.println(Arrays.toString(set));
  }
}
