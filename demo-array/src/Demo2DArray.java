import java.util.Arrays;

public class Demo2DArray {

  //printArray mmethod
  public static void print(int [][] arr) {
    for (int i=0 ;i< arr.length; i++){
      for (int j=0;j<arr[0].length;j++){
        if (j<arr[0].length-1) {
          System.out.print(arr[i][j]+",");
        } else {
          System.out.print(arr[i][j]);
        }
      }
      System.out.println("");
    }
  }

  public static void print1dArray(int [] arrays1) {
    for (int i=0 ;i< arrays1.length; i++){
      if (i<arrays1.length-1) {
        System.out.print(arrays1[i]+",");
      } else {
        System.out.print(arrays1[i]);
      }
      System.out.println("");
    }
  }

  public static void printStringArray(String [] arraysString) {
    for (int i=0 ;i< arraysString.length; i++){
      if (i<arraysString.length-1) {
        System.out.print(arraysString[i]+",");
      } else {
        System.out.print(arraysString[i]);
      }
      System.out.println("");
    }
  }
  
  public static void main(String[] args) {
    int [] arr = new int[10];
    int [] arr2 = new int[] {4,5,56,7,8};
    //int [] arr3 = {4,5,56,7,8}; not prefer
    for (int i=0; i< arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    //2D int Arrays
    //1,3,10
    //2,4,6
    //11,13,17
    //declare a 2D array
    int [][] arr2d = new int [3][3];
    int [][] arr2d2 = new int [][] {{1,3,10,11},{2,4,6,12},{11,13,17,13}};
    //int [] [] arr2d3 = {{1,3,10},{2,4,6},{11,13,17}};not prefer
    
    //i -> row ->{1,3,10},{2,4,6},{11,13,17} -> arr2d2.length 
    //j -> column -> arr2d2[0].length -> {1,3,10} 以個長度
    for (int i =0;i<arr2d2.length; i++) {//i=0,1,2
      for (int j =0 ; j<arr2d2[0].length ; j++) {//j=0,1,2
        //System.out.println("i= "+i+", j= "+j+", Ans= " +arr2d2[i][j]);
      }
    }
    

    //assign 1,3,5,7,9... (odd number) to arr2d
    int count = 1;
    for (int i=0; i < arr2d.length; i++) {
      for (int j=0; j< arr2d[0].length;j++) {
        arr2d[i][j] = count;
        count +=2;
      }
    }

    print(arr2d);//print elemnets in 2d Array
    //assign 2,4,6,8,10... (odd number) to arr2ds

    int [][] arr2ds = new int[3][3];
    int counts = 2;
    for (int i=0; i < arr2ds.length; i++) {
      for (int j=0; j< arr2ds[0].length;j++) {
        arr2ds[i][j] = counts;
        counts +=2;
      }
    }
    print(arr2ds);

    //product of arr2d and arr2ds (i.e 1X2, 3X4, 5X6,....)
    //assumption : arr2d.length = arr2ds.length , arr2d[0].length = arr2ds[0].length 
    //output result to another array
    int [][] arrResult = new int [arr2ds.length][arr2ds[0].length];
    for (int i=0; i< arr2ds.length;i++) {
      for (int j=0; j<arr2ds[0].length ;j++) {
        arrResult[i][j] = arr2d[i][j] * arr2ds[i][j];
      }
    }
    print(arrResult);

    //arr2d arr2ds (3 X 3)
    //1,3,10
    //2,4,6
    //11,13,17

    //convert 2d array to 1d array(1+2+11,3+4+13,10+6+17)
    int [][] arr5 = new int [][] {{1,3,10},{2,4,6},{11,13,17}};
    int [] result = new int [arr5[0].length];
    for (int i=0; i< arr5.length;i++){
      for (int j=0;j< arr5[0].length;j++){
        result[i] += arr5[j][i];// <- i=0,j=0, [0][0]-> 1,  i=0,j=1,[1][0]-> 2,  i=0,j=2,[2][0]-> 11
        //System.out.println(result[i]);
        // 本身[i][j]-> 行左row 先再行column
        //i=0, [0][0] -> 1,[0][1]-> 3 , [0][2]-> 10
        //
      }
    }
    //System.out.println(Arrays.toString(result));
    print1dArray(result);

    char [][] arr9 = new char [][] {{'h','e','l','l','o'},{'j','o','h','n'}};
    String [] str = new String [arr9.length];
    for (int i=0; i< arr9.length;i++) {
      str[i] ="";
      for (int j=0; j< arr9[i].length;j++){
        str[i] += arr9[i][j];
      }
    }
    printStringArray(str);
  }
}
