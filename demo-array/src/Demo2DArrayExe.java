public class Demo2DArrayExe {
 
  public static void print(int [][] ar) {
    for (int i =0; i< ar.length;i++){
      for (int j=0;j<ar[0].length;j++){
        if (j< ar[0].length-1)
          System.out.print(ar[i][j]+",");
        else 
          System.out.print(ar[i][j]);
      }
      System.out.println("");
    }
  }
  public static void print1DArray(int [] ars){
    for (int i=0; i<ars.length;i++){
      if(i<ars.length-1){
        System.out.print(ars[i]+",");
      } else {
        System.out.print(ars[i]);
      }
    }
  }
  public static void print1DChar(String [] str){
    for (int i=0; i< str.length;i++){
      if (i< str.length-1){
        System.out.print(str[i]+" ");
      } else {
        System.out.print(str[i]);
      }
    }
  }
  

  public static void main(String[] args) {
    int [][] ar2 = new int [4][4];
    int num = 1;
    //assign 1,3,5,7,9... (odd number) to ar2
    for (int i=0;i<ar2.length;i++){
      for (int j=0;j<ar2[0].length;j++){
        ar2[i][j] = num;
        num +=2;
      }
    }
    //print(ar2);
    //assign 2,4,6,8,10... (odd number) to arr2ds
    int [][] ar3 = new int [4][4];
    int nums = 2;
    for (int i=0;i<ar3.length;i++){
      for (int j=0; j<ar3[0].length;j++){
        ar3[i][j]= nums;
        nums+=2;
      }
    }
    //print(ar3);
    int [][] arResult = new int [ar3.length][ar3[0].length];
    for (int i=0;i<arResult.length; i++){
      for (int j=0;j<arResult[0].length;j++) {
        arResult[i][j] = ar2[i][j] * ar3[i][j];
      }
    }
    //print(arResult);

    //convert 2d array to 1d array(1+2+11,3+4+13,10+6+17)
    int [][] ar4 = new int [][] {{1,3,10},{2,4,6},{11,13,17}};
    //create a 1d arraylist
    int [] ar5 = new int [ar4[0].length];
    for (int i=0;i<ar4.length;i++){
      for(int j=0;j<ar4[0].length;j++){
        ar5[i] += ar4[j][i];
      }
    }
    //print1DArray(ar5);

    char [][] ar6 = new char [][] {{'h','e','l','l','o'},{'j','o','h','n'}};
    String [] ar7 = new String[ar6.length];
    for (int i=0; i<ar6.length;i++){
      ar7[i] = "";
      for(int j=0;j<ar6[i].length;j++){
        ar7[i] += ar6[i][j];
      }
    }
    print1DChar(ar7);


  } 
}
