import java.util.Arrays;

public class LeetCodeExe {
	public static void main(String[] args) {
    //nums1 = [1,2,2,1], 
    //nums2 = [2,2]
    int [] nums1 = new int [] {1,2,2,1} ;
    int [] nums2 = new int [] {2,2} ;
    int [] arr1 = new int [nums1.length];

    for (int i =0; i <nums1.length;i++) {
      if (++arr1 [nums1[i]]==2);

    }
    
    int maxCount =0;
    for (int max : arr1) {
      if (max > maxCount ){
        maxCount = max ;
      }
    }
    System.out.println("max count "+maxCount);
    maxCount =0;
    int no = 0;
    for(int i=0; i<nums1.length;i++){
      if (arr1[i]>= maxCount) {
        maxCount = arr1[i];
        no = i;
      }
    }
    System.out.println(Arrays.toString(arr1));
    
  }
}
