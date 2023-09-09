public class TestStringExe {
  public static void main(String[]args) {
    String str2 = "Edwin";
    String str4 = "Edward";

    //print true / false
    //questions : check if two string has a common character

    boolean isTrue = false ;
    outerLoop: for (int i = 0; i < str2.length(); i++) {
      for (int j = 0; j < str4.length(); j++) {
        if (str2.charAt(i) == str4.charAt(j)) {
          isTrue = true;
          System.out.println(str2.charAt(i));
          break outerLoop;
        }
      }
    }
    System.out.println(isTrue);//true
  }
}
