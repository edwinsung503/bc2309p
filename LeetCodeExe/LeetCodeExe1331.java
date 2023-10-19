import java.util.Arrays;

public class LeetCodeExe1331 {
  public static void main(String[] args) {
    int [] arr= new int [] {40,10,20,30,40,10,20,30};
    int [] arr2= arr.clone();
    
    Arrays.sort(arr);

    int pastNum = 0;
    int counting = 0;
    int [] arr3 = new int [arr.length];
    for (int i=0; i< arr.length;i++){
      if (arr[i]==pastNum){
        continue;
      } else{
        //System.out.println(counting+"= "+arr[i]);
        arr3[counting] = arr[i];
        pastNum = arr[i];
        counting ++;
      }
    }
    System.out.println(Arrays.toString(arr3));

   int [] counts = new int [arr2.length];
    for (int i=0; i< arr2.length;i++){
      //{37,12,28,9,100,56,80,5,12}
      //[5, 9, 12, 12, 28, 37, 56, 80, 100] < delete duplicate 
      for (int j=0; j< arr3.length;j++){
        if (arr2[i] == arr3[j] ) {
          counts[i] = j+1;
          break;
          //System.out.println(arr[j]+"= "+count);
        }
      }
    }
    System.out.println(Arrays.toString(counts));
    

  }
}