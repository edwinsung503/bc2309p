import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCodeExe {
  public static void main(String[] args) {
    int [] nums = new int [] {1,2,3,6,6,6};
    int max = 0;
    for (int i=0; i<nums.length; i++) {
      if (nums[i]> max){
        max = nums[i];
      }
    }
    System.out.println(max);
    //int n = nums.length * 2;
    int [] countArray = new int [max+1];
    int maxIndex = 0;
    for (int i =0; i<nums.length ;i++) {
      countArray[nums[i]] +=1;
    }

    System.out.println(Arrays.toString(countArray));
    for (int i = 0; i< countArray.length;i++) {
      while (countArray[i]==3){
        System.out.println(i);
        break;
      }
    }

  }
}
