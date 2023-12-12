package syntax;

import java.util.Random;

public class DemoSyntax {
  
  public static void main(String[] args) {
    
    SupplyInteger randomOddNubmer = () -> {
      int times = new Random().nextInt(10);
      return 1 + times* 2;
    };
    System.out.println(randomOddNubmer.supply());


   // SupplyString sayHello = () -> {
     // return "hello ";
    //};
    SupplyString howAreYou ;
    int x = 10;

    if (x>=10){
      howAreYou = () -> {
        return "Hello";
      };
    } else {
      howAreYou = () -> "goodbye";
    }

    System.out.println(howAreYou.supply());;
    CharFunction cf = (s,i) -> {
      return s.charAt(i);//auto-box : char -> character
    };
    System.out.println(cf.charFunction("Hello",1));//l
    System.out.println(cf.charFunction("abcdef",0));//0
    //System.out.println(cf.charFunction("abcdef",10));//10 -> runtime exception

    String [] source = new String[] {"abc","def","ijk"};
    ConcatFunction formula;
    if (source.length <10) {
      formula = (arr) -> {
        String r ="";
        for (String s : arr) {
          r = r.concat(s);// contact 係new object -> 要揾野接住
        }
        return r;
      };
    } else {
      formula = (arr) -> {
        StringBuilder sb = new StringBuilder();//sb -> already address, but not create a new object, so no need find the new object reference 
        for (String s:arr ){
          sb.append(s);
        }
        return sb.toString();
      };
    }
    System.out.println(formula.concat(source));
  }
}