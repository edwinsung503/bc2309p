public class DemoConversion {
  public static void main(String[]args) throws Exception {
      //Primitives
      //upcast (promotion)
      // byte - > short -> int -> long (Integer)
      byte b = 10;
      short s = b; // upcast : from byte to short
      short s2 = 10; //-< short 係可以裝什麼case, 唔會睇assign 什麼value, 只會睇可能性
      //byte b2 = s -> //error -> java complier 保護你唔俾你做, 因為唔正確
      int i = s ;
      long l = i;
      
      //float -> double
      float f = 10.323f;
      double d = f; // upcast 

      //char -> int 
      char c = 'a' ; //ascii code
      int w = c ; // upcast
      System.out.println(w) ;// 97 @ ascii code

      //char c2 = w; // int(21憶) 個可能性唔可以放入char(可能出現精度損失)
      //int -> char , error

      //downcast
      short s3 = 10;
      byte b3 = (byte) s3;//強行做downcast
      System.out.println(b3);//10 (無問題因為byte 由-128 <> 127)


      short s4 = 30000;
      byte b4 = (byte) s4;//強行downcast 但唔會理你個數值係咪within (byte)range
      System.out.println(b4);//Java behavior (Overflow) -> (128+127) = 256 次-> 旋轉30000 次至最後48

      short s5 = 128;
      byte b5 = (byte) s5;
      System.out.println(b5) ; // =127 + 1 -> (-128 to 127 ) 由-128開始返

      double d5 = 10.234d;
      float f5 = (float) d5;
      System.out.println(f5);

      short s6 = 32767 ; //<< 要set 個大d varaible (primitives) , 用int 
      s6++;
      System.out.println(s6);// -32768  
      
      // int - > char (6xxxx) (0 -127)
      int i6 = 99;// ascii character : 'c'
      char c6 = (char) i6;
      System.out.println(c6);//'c'

      char c8 = 'A';// ascii 65
      char c9 = 'a'; //ascii 97

      if (c8 > c9) {//java 估到你將chart conver to int (conversion : char -> int)
        //因為文字係做唔到對比
        System.out.println("c8 > c9 in ascii") ;
      } else {
        System.out.println("c9 >= c8 in ascii"); // print
      }
      
      byte b9 = 100;//byte convert to short
      short s9 = 101;
      if (s9 > b9) {//conversion: byte -> short
        System.out.println("s9 > b9");
      }
  }
}
