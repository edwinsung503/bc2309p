import java.util.Arrays;

public class LeetCodeExe2 {
  //nums = [1,1,2,2,2,3]
  public static void main(String[] args) {
    int [] arr= new int [] {1,1,2,2,2,3};
    int [] countArray = new int [arr.length+1];
    for (int i=0; i< arr.length;i++) {
      countArray[arr[i]] ++;
    
    }
    System.out.println(Arrays.toString(countArray));  
    int [] arr2 = new int [arr.length];
    //System.out.println(countArray[1]);
    int counts = 0;

  }
  
}
