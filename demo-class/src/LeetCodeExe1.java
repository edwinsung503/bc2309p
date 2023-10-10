import java.util.Arrays;

public class LeetCodeExe1 {
  
  public static void main(String[] args) {
    int [] nums1 = new int [] {1,2,2,1} ;
    int [] nums2 = new int [] {2,2,3,3,4} ;
    //-> 2
    int [] arr = new int [1000];
    
    //for(int i=0; i< nums1.length;i++) {
      //if (nums1[i]== 2) {
        //arr[nums1[i]]+=1;
      //}
    //}
    //System.out.println(Arrays.toString(arr));
    int countNum = 0;
    int size = 0;
    int [] arr3 = new int [ 1000];
    for(int i=0; i< nums1.length;i++) {
      for(int j=0; j< nums2.length;j++) {
        if(nums1[i]==nums2[j]) {
          if (++arr[nums1[i]] ==2){
            countNum =nums1[i];
            arr3[i] =nums1[i];
            size ++;
            System.out.println(countNum);
          }
        }
      }
    }
    //System.out.println(Arrays.toString(arr3));
    int counts = 0;
    for (int i=0;i<arr3.length;i++) {
      if (arr3[i]!=0){
        counts++;
      }
    }
    System.out.println(counts);
    int []arr5 = new int [counts];
    for (int i= 0 ; i < counts;i++) {
      arr5[i] = arr3[i];
    }
    System.out.println(Arrays.toString(arr5));

  }
}
