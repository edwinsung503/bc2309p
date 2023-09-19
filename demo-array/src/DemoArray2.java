import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[]args ) {
    //int [] arr = new int [] {10,4,2,100,-3} ;
    //[-3,2,4,10,100] -> ascending order sorting
    int [] result = bubbleSort(new int [] {10,4,2,100,-3});
    System.out.println((Arrays.toString(result)));
    int [] result2 = bubbleSort(new int [] {-100,-3,-1023,-1,-3});
    System.out.println((Arrays.toString(result2)));
  }
  }
  
  public static int [] bubbleSort(int[] arr) {
    int max = Integer.MIN_VALUE;// 用最細果個數
    int idx = -1;
    int temp = -1;//TBC
    for (int i = arr.length-1; i >=1; i-- ) {
      max =Integer.MIN_VALUE;
      //find the max value - > 100
      for (int j = i; j >= 0; j--) {
        if (arr[j] > max) {
          max = arr[j] ;
          idx = j;
        }
      }
      //swap 
      if (i != idx) {
        temp = arr[idx];
        arr[idx] = arr[idx+1];
        arr[idx+1] = temp;
      }
    }
  }

}
