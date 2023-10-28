import java.util.Arrays;

public class DemoArray {
  public static void main(String[]args) throws Exception {
    int i1 = 100;
    int i2 = 105;
    int i3 = 108;

    //array
    int [] array;//declaration
    array = new int [3];// 要係java 上連續開幾多格仔(initialization)

    int [] arr = new int[3]; // 0,1,2 -> index of the array
    //assign values to array
    //arr [-1] = 99; // array 無負數的Index
    arr[0] = 100;
    arr[1] = 105;
    arr[2] = 108;
    //arr[3] = 110; // run-time error

    arr [1] = 106;//可改variable value 由105 > 106
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    for (int i = 0 ; i < 3 ; i++) {
      System.out.println(arr[i]);//100,106,108
    }

    int o = arr[0]; // arr[0] - > int (int array) 只可以放int variables
    System.out.println(o);//100
    //arr[1] = 3L; // error, cannot assign long value to int vaialbe

    //declare arra with the size 6
    //declare char array with size 4
    int [] arrs = new int[6];
    arrs[0] = 100;
    arrs[1] = 102;
    arrs[2] = 104;
    arrs[3] = 106;
    arrs[4] = 108;
    arrs[5] = 110;

    for (int i = 0; i < 6; i++) {
      System.out.println(arrs[i]);
    }

    char [] charrs = new char[4];
    charrs [0] = 'a';
    charrs [1] = 'b';
    charrs [2] = 'c';
    charrs [3] = 'd';

    for (int j = 0; j < 4; j++) {
      System.out.println(charrs[j]);
    }
    //boolean array with size 5
    boolean [] boos = new boolean[5];
    boos [0] = true;
    boos [1] = false;
    boos [2] = true;
    boos [3] = false;
    boos [4] = false;

    for (int i = 0; i < 5; i++) {
      System.out.println(boos[i]);
    }

    int [] arr5 = new int[] {100,99,1005,2000};//默認長度係4,長度不能改寫
    arr5[3] = 3000;
    //arr5[4] = 30001; // run-time error // run 果時先知的error

    arr5 = new int [] {1,2,3,4,5};//舊的arr5 已經消失左//因為declare 左就唔使再declare
    
    //1,4,3,2,5
    //Swap elements of index 1 and index 3
    int temp = 0;
    for (int i =0; i < arr5.length; i++) {
      if (i == 1) {
        //Swap 
        temp = arr5[i]; // 2
        arr5[i] = arr5[i  ]; //2 
        arr5[i+2] = temp;//4
      }
    }
    //System.out.println(arr5);//I@372f7a8d -> object reference (地址)
    System.out.println(Arrays.toString(arr5));//[1,4,3,2,5]


    //arr5: Swap min and max value
    //1,4,3,2,5 - > 5,4,3,2,1
    //光速call temp 的地址講佢係什麼
    int max = -1;
    int min= 10000;
    int maxIdx = -1;
    int minIdx= -1;
    int temp1= -1;
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > max ){
        max = arr5[i];
        maxIdx = i;
      } 
      if (arr5[i] < min) {
        min = arr5[i];
        minIdx = i;
      }
    }
    temp1 = arr5[minIdx];
    arr5[minIdx] = arr5[maxIdx] ;
    arr5[maxIdx] = temp1;
    System.out.println(Arrays.toString(arr5));//5,4,3,2,1

    //move max value to the tail of the array
    //[4,3,2,1,5]
    //step 1: index of max value;//max value is 5, //5,4,3,2,1
    
    int max1 = -1;
    int min1 = 10000;
    int max1Idx = -1;
    int min1Idx = -1;
    int temp2 =0;
    for (int i = 0; i <arr5.length; i++) {
      if (arr5[i] > max) {
        max1 = arr5[i];
        max1Idx = i;//0
      } 
    } 
    //step 2; loop -> swap. when to start? index = 0
    for (int i = 0; i < arr5.length -1; i++) {//- 1 係因為唔使換到最後已換完。
      if (i >= max1Idx) {
        temp2 = arr5[i];
        arr5[i] = arr5[i+1];
        arr5[i+1] = temp2;
      }
    }
    System.out.println(Arrays.toString(arr5));//4,3,2,1,5

    //reverse the string
    String str = "hello";
    //hello - > olleh
    char [] characters = str.toCharArray();
    char temp3 = ' ';
    for (int i = 0; i < str.length() / 2; i++) {// i =0,2
      //i = 0, swap 'h' and 'o'
      //i = 2, swap 'e' and 'l'
      temp3 = characters[i];
      characters[i] = characters[str.length() -1 - i];//0th, 5-1-0 =4th 
      characters[str.length() - 1 - i] = temp3;
      
    }
    str = String.valueOf(characters);
    System.out.println(str);//olleh

  }
  
}
