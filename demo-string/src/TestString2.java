import java.util.Arrays;

public class TestString2 {
  public static void main(String[]args) {
    String str = "hello world";// [hello], [world]
    String [] strs = new String [100];
    String temp = "";
    int j = -1;
    //揾返" "的位分開
    //知道i = 位置
    //
    for (int i =0; i < str.length(); i ++) {
        if (str.charAt(i) == ' ') {
          strs[++j] = temp;
          temp ="";
          continue;
        }
        temp += str.charAt(i);
      }
      strs[++j] = temp;


    //split()
    String []  results = str.split(" ");
    System.out.println(Arrays.toString(results));

    //replace()
    System.out.println(str.replace(" ","_"));
    System.out.println(TestString2.compute("abc", "bc"));
    System.out.println(TestString2.compute("abc", "wxyz"));

    }
    public static String compute(String str1,String str2) {
      //if length of str1 > str2, return str1+ str2, else str2
      if (str1.length() > str2.length()) 
        return str1.concat(str2); // -> str1 + str2 
      return str2;
    }
  } 
