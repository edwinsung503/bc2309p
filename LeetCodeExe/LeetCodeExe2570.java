public class LeetCodeExe2570 {
  //2570. Merge Two 2D Arrays by Summing Values
  public static void main(String[] args) {
    int [][] num1 = new int [][]{{1,2},{3,4},{5,6}};
    
    int [] nums1 = new int [10];

    for (int [] row:num1) {
      for (int elem : row) {
        if (elem % 2 ==0){
          System.out.print(elem+" ");
          
        }
      }
    }
    
    
  }
  
}
