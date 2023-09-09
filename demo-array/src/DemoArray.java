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

    
  }
  
}
