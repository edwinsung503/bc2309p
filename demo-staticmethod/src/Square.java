import java.util.Arrays;

public class Square {
  public static short area(int length) {
    //int area = length * length; if 唔好任何野就將int area = return
    return (short) (length * length); // int * int - > change to length
    //return a variable, which type should match the method return;
  }

  //Practice: Try to design 2 method A & B
  //you have to call method A, and the method A will reply on Method B for call
  //main() -> method A - method B


  public static int area2(int length) {
    return length * length ;
  }
  public static double area3(int length) {// 2 * 2 = > 4
    return Math.pow(length,2) ; // 2次方, 就算正數係double 都會出正數
    //因為math.pow 係用double 去寫
  }
  public static int profit(int length) {
    return length * length / (10 * 4) - length;
  }

  public static int max(int[] arr) {
    int max1 = 0;
    for (int i = 0; i < arr.length-1; i++) {
      //if (arr[i] > max1) {
        //max1 = arr[i];
        max1 = Math.max (arr[i],max1);
      }
  return max1;
  }

  
  public static void main(String[]args){
    System.out.println(Square.area(2));//4
    System.out.println(Square.area3(4));//16
       
    //用來描述睇得明的program
    int x = 10;
    int area = -1;
    if (x > 8) {
      area = Square.area2(x);
    } else {
      area = (int) Square.area3(x);
    }
    int [] Integers = new int [] {1,2,3,4,5} ;
    System.out.println(Square.max(Integers));

    

  }
}
