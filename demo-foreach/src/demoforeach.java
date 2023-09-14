import java.util.Arrays;

public class demoforeach {
  public static void main (String[]args) {
    int[] arrs = new int [] {1,2,3,4,5};
    //for-loop
    for (int i =0; i < arrs.length; i++) {// for loop as a counter
      System.out.println(arrs[i]);
    }
    //for-each
    for (int num: arrs) {//最normal 的寫法
      System.out.println(num);//拎唔到element 的index 出來, 所以要用其他方法拎出來
    }
    //for-each, string array
    String [] sens = new String[] {"Good morning"};
    for (String s : sens){
      System.out.println(s);
    }

  }
}
