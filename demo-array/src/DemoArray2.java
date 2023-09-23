import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[]args ) {
    //int [] arr = new int [] {10,4,2,100,-3} ;
    //[-3,2,4,10,100] -> ascending order sorting
    int [] result = bubbleSort(new int [] {10,4,2,100,-3});
    System.out.println((Arrays.toString(result)));
    int [] result2 = bubbleSort(new int [] {-100,-3,-1023,-1,-3});
    System.out.println((Arrays.toString(result2)));
    int [] result3 = sum(new int [] {10,4,2,100,-3});
    System.out.println((Arrays.toString(result3)));

    }
  
  
  public static int [] bubbleSort(int[] arr) {
    int max = -1;//Integer.MIN_VALUE;// 用Integer最細果個數
    int idx = -1;
    int temp = -1;//TBC
    for (int i = arr.length-1; i >=1; i-- ) {
      max = arr[0];// 將max初始化為數組中的第一個元素
      idx = 0;
      for (int j = 1; j <= i; j++) {
        if (arr[j] > max) {
          max = arr[j] ;  
          idx = j;
        }
      }
      //swap 
      if (i != idx) {
        temp = arr[idx];
        arr[idx] = arr[i];// 將最大值與當前迭代的最後一個元素交換
        arr[i] = temp;
      }
    }
    return arr;
  }
  public static int [] sum(int [] ars) {
    int temp1 = 0;
    for (int i = 0; i < ars.length-1; i++) {
      for (int j = 0; j < ars.length-i-1; j++) {
        if (ars[j] > ars[j+1]) {
          temp1 = ars[j];
          ars[j] = ars[j+1];
          ars[j+1] = temp1;
        }
      }
    }
    return ars;
  }
}
