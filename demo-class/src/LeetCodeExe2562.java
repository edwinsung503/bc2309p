import java.util.Arrays;

public class LeetCodeExe2562 {

  public static void main(String[] args) {
    int [] nums = new int [] {2,3,-1,8,4};
    int count =0;
    int leftnum = 0;
    int rightnum = 0;
    int counting = 0;
    boolean finish = true;
    while (count <nums.length && finish){
      for (int i = 0; i< count; i++ ){
        leftnum +=nums[i];
        counting = i;
      }
      System.out.println(leftnum);
      for (int j = count -1; j>= count;j--){
        rightnum += nums[j];
      }
      System.out.println(rightnum);
      //if (leftnum == rightnum) {
        //finish =false;
      //}
        //count++;
      //}
      count++;
    }
    
    
    


  }
}