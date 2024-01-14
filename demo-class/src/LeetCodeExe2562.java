import java.util.Arrays;

public class LeetCodeExe2562 {

  public static void main(String[] args) {
    int [][] nums = new int [][] {{1,2,3,4},{5,6,7,8}};

    for (int i =0; i< nums.length; i++) {
      for (int j = 0 ; j<nums[i].length;j++){
        //System.out.println(nums[i][j]+" ");
    }
    }

    int [][] num2 = new int [3][3];
    int count =1;
    for (int i=0; i< num2.length; i++){
      for (int j= 0; j<num2[i].length ; j++){
        num2[i][j] = count;
        count++;
      }
      System.out.println(Arrays.toString(num2[i]));
    }
    
  }
}