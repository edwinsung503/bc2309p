public class TestStrings {
  public static void main(String[]args) {
    String str1 = "abcd";
    String str3 = "xcyz";
    //print true / fasle
    //questions : check if two string has a common character
    boolean common = false;

    outerLoop: for (int i = 0 ; i < str1.length() ; i++) {// ** remember 用.length() (outerLoop is just a name)
      // i = 0
      for (int j = 0; j < str3.length() ; j++) {
        // str1.charAt(i) -> a
        if (str1.charAt(i) == str3.charAt(j)) {
          common = true;
          break outerLoop;// break all loops -> break outerLoop
        }
      }
    }
    System.out.println(common);
  }
}
