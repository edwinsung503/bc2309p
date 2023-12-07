import java.util.Arrays;

public class LeetCodeExe1636 {

  
  public static void main(String[] args) {
    int [] nums = new int [] {2,3,1,3,2};
    int [] arr = new int [nums.length];
    for (int i =0; i< nums.length;i++){
      arr[nums[i]] +=1;
    }
    //System.out.println(Arrays.toString(arr));
    //[0, 1, 2, 2, 0, 0]
    int frq = 1;
    int idx =0;
    int [] arrResult = new int [arr.length];
    
    for (int k=0; k< arr.length;k++){
      for (int i= 0; i< arr.length; i++){
        if (arr[i] == frq ){
          if (arr[i+1] != frq){
            for (int j =0 ; j<frq; j++){
              arrResult[idx++] = i;
            }
          } else {
            for (int j =0 ; j<frq; j++){
              arrResult[idx++] = i;
            }
          }
        }
      }
      frq ++;
    }
    //[1, 2, 2, 3, 3]
    //Output: [1,3,3,2,2]
    System.out.println(Arrays.toString(arrResult));
  }
}
