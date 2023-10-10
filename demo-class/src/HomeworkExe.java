import java.util.Arrays;

public class HomeworkExe {
 
  public static void main(String[] args) {
    //Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
    int [] arr = new int [] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    //[120, 25, 14, 56, 15, 36, 56, 77, 18, 29]
    int temp =0;
    for (int i =arr.length-1 ; i>=1; i--) {
      arr[i] = arr[i-1];

    }
    arr[0]= 120;
    System.out.println(Arrays.toString(arr)); 
  }

}
