import javax.swing.plaf.synth.SynthSeparatorUI;

public class SquareExe {
  
  public static short area(int length) {
    return (short) (length * length);
  }

  public static int area2(int lengths, int width) {
    return lengths * width ;
  }
  public static String str (String word, String words){
    return word + words;
  }

  public static int random(int num1, int num2) {
    return Math.min(num1,num2) ;
  }

  public static int numbers(int [] arrs) {
    int max = 0;
    for (int i =0; i <arrs.length; i++) {
      max = Math.max(arrs[i],max);
    }
    return max;
  }

  public static int methodA(int num3,int num4) {
    return num3 - num4;
  }
  public static int methodB(int num5, int num6){
    return num5 + num6 + methodA(num5, num6);
  }



  public static void main(String[]args) {
    System.out.println(SquareExe.area(2));//4
    System.out.println(SquareExe.area2(2,5));//10
    String word = "Hello ";
    System.out.println(SquareExe.str(word,"abc"));//Hello abc
    System.out.println(SquareExe.random(2,5));//2
    int [] arrs = new int [] {2,3,4,5,6};
    System.out.println(SquareExe.numbers(arrs));//6
    SquareExe.methodA(6, 2) ;//4
    System.out.println(SquareExe.methodB(7, 5));//14
    
  }
}
