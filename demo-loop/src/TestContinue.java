public class TestContinue {
  public static void main(String[]args) {
    // for loop 10 times
    
    for (int i = 0 ; i <10 ; i++) {
      if (i >=2) {
        continue;// go to i++
      }
      //System.out.println("i="+i); // i=0,i=1
    }

    // 2,4,6,8,10 - > continue
    for (int i = 1; i < 11; i++) {
      if (i % 2 != 0) {
        continue;
      } 
      System.out.println("i="+i);
    }

    for (int i = 1; i < 10; i++) {
      if (i % 2 ==1) {
        continue;//skipping sth
      }
      System.out.println(i);
    }
    //skip the rest
    //codes....

    String s = "abcd";

    //charAt, for loop. print a b c d
    for (int i = 0 ; i < s.length(); i++) {//s.length == 4 - > 0,1,2,3
      System.out.println(s.charAt(i)); // a > b > c > d
    }
    
    // what is the position of c? Ans : 2

    for (int i = 0 ; i < s.length(); i++) {// times of loop
      if (s.charAt(i) =='c') {
        System.out.println(i); 
      }
    }

    //find the char "x", and print the next char of "x"
    //if not found, print -1
    String s2 = "ijkxyz";
    boolean found = false; // <-
    char target = ' ';// <- 俾人係分到容易明白(暫存的地方)

    // 因為我無停佢, 佢每次要行多幾個step, program 會比下面果個慢
    //self exe
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'x') {
        System.out.println(s2.charAt(i+1));
      } else {
        System.out.println(-1);
      }
    }

    //example 
    for (int i = 0 ; i < s2.length(); i++) {
      //target 
      //found
      if (s2.charAt(i) == 'x') {
        target = s2.charAt(i+1); // assign 'y' to variable target
        found = true ; // *** 令到佢變左true -> 可以打需要做的work ***
        break;//*** 以最快的方法離開program ***
      }
    }
    if (found) {//  true
      System.out.println(target);
    } else {
      System.out.println(-1);
    }
    
  }
}
