import java.util.Arrays;

public class LeetCodeExe1608 {

  public static void main(String[] args) {
    int [] nums = new int[]{3,5};
    //0,4,3,0,4
    //0,0
    int x = nums.length;
    int [] count = new int [x+1];

    for (int elem:nums) {
      if (elem >=x) {
        count [x]++;
      } else {
        count[elem]++;
      }
    }
    System.out.println(Arrays.toString(count));
    int res = 0;
    for (int i = count.length-1;i>0;i--){
      res+= count[i];
      //System.out.println("Res= "+res);
      //System.out.println("Count= "+count[i]);
      //System.out.println("i= "+i);
      if (res ==i){
        System.out.println(i);
      }
    }
  }
}