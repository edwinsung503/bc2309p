import java.util.Arrays;

public class DemoArrayLoopExes {
  public static void main(String[]args) {
    int[] arr1 = new int [] {2,5,10,8,100};
    //find the sum
    //find the max value
    //find the min value
    //find the average value
    //print the index of value of 10
    int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum += arr1[i];
    }
    System.out.println(sum);//125
    int max = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] > max) {
        max = arr1[i];
      }
    }
    System.out.println(max);//100

    int min = 1000;
    for (int i = 0; i < arr1.length; i ++) {
      if (arr1[i] < min) {
        min = arr1[i];
      }
    }
    System.out.println(min);//2
    int average = 0 ;
    sum = 0;
    for (int i =0; i < arr1.length; i++) {
      sum += arr1[i];
    }
    average = sum / arr1.length;
    System.out.println(average);//25

    int target = 10;
    for (int i =0; i < arr1.length; i++) {
      if (arr1[i] == target) {
        System.out.println(i);//2
      }
    }
    String str1 = "Good morning";
    char target1 = 'd';
    //replace d to z - > 拆返每個字母
    char [] characters = str1.toCharArray();
    for (int i=0; i < characters.length; i ++) {
      if (characters[i] == target1) {
        characters[i] = 'z';
      }
    }
    System.out.println(String.valueOf(characters)); //Gooz morning

    int[] arr2 = new int [] {2,5,-10,8,100};
    //swap the min to last characters;
    int minIndex = 0;
    for (int i =0; i< arr2.length; i++) {
      if (arr2[i] < arr2[minIndex]) {
        minIndex = i;
      }
    }
    int temp = arr2[minIndex];
    arr2[minIndex] = arr2[arr2.length -1];
    arr2[arr2.length -1 ] = temp;
    System.out.println(Arrays.toString(arr2)) ;//2,5,100,8,-10



    int[] arr3 = new int [] {-100,5,-10,8,100};
    minIndex = 0;
    for (int i =0; i < arr3.length; i++) {
      if (arr3[i] < arr3[minIndex]) {
        minIndex = i;
      }
    }
    int temp1 = arr3[minIndex];
    arr3[minIndex] = arr3[arr3.length-1]; 
    arr3[arr3.length-1] = temp1;
    System.out.println(Arrays.toString(arr3));//{100,5,-10,8,-100}


    //{1,3,4,-5,6,7,8}
    int [] arr4 = new int [] {1,3,4,-5,6,7,8};
    minIndex = 0;
    for (int i=0; i < arr4.length; i++) {
      if (arr4[i] < arr4[minIndex]) {
        minIndex = i;
      }
    }
    int temp3 =0;
    temp3 = arr4[minIndex];
    arr4[minIndex] = arr4[arr4.length-1];
    arr4[arr4.length-1] = temp3;
    System.out.println(Arrays.toString(arr4));//{1,3,4,8,6,7,-5}

    //{1,213,4,8,6,7,-5}
    int [] arr5 = new int[] {1,213,4,8,6,7,-5};
    int maxIdx = 0;
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > arr5[maxIdx] ) {
        maxIdx = i;
      }
    }
    int temp2 = arr5[maxIdx];
    arr5[maxIdx] = arr5[arr5.length -1];
    arr5[arr5.length -1] = temp2;
    System.out.println(Arrays.toString(arr5));//{1,-5,4,8,6,7,213}

    int [] arr6 = new int [] {1,2,3,4,5};
    //1,4,3,2,5
    //Swap elements of index 1 and index 3
    temp = 0;
    for (int i = 0; i < arr6.length; i++ ) {
      if (i == 1) {
        temp = arr6[i];
        arr6[i] = arr6[i+2];
        arr6[i+2] = temp;
      }
    }
    System.out.println(Arrays.toString(arr6));//1,4,3,2,5

    //arr6: Swap min and max value
    //1,4,3,2,5 - > 5,4,3,2,1
    //光速call temp 的地址講佢係什麼
    int min2 = 1000;
    int max2 = -1;
    int minIdx2 =0;
    int maxIdx2 =0;
    for (int i =0; i < arr6.length; i++) {
      if (arr6[i] < min2) {
        min2 = arr6[i];
        minIdx2 = i;
      }
      if (arr6[i] > max2) {
        max2 = arr6[i];
        maxIdx2 = i;
      }
    }
    temp = arr6[minIdx2] ;
    arr6[minIdx2] = arr6[maxIdx2];
    arr6[maxIdx2] = temp;
    System.out.println(Arrays.toString(arr6));//5,4,3,2,1

    int [] list = new int[] {6,7,8,9,10};
    min = 10000;
    max = -1;
    int minIdx = 0;
    maxIdx = 0;
    //10,7,8,9,6
    for (int i = 0; i < list.length; i++) {
      if (list[i] < min) {
        min = list[i];
        minIdx = i;
      }
      if (list[i] > max) {
        max = list[i];
        maxIdx = i;
      }
    }
    temp = list[minIdx] ;
    list[minIdx]  = list[maxIdx];
    list[maxIdx] = temp;
    System.out.println(Arrays.toString(list));//10,7,8,9,6

    //move max value to the tail of the array
    //[4,3,2,1,5]
    //step 1: index of max value;//max value is 5, //5,4,3,2,1
    //step 2; loop -> swap. when to start? index = 0
    //arr6
    
    min = 10000;
    max = -1;
    minIdx =0;
    maxIdx = 0;
    temp =0;

    for (int i =0; i < arr6.length; i++) {
      if (arr6[i] > max) {
        max = arr6[i];
        maxIdx = i;
      }
    }
    for (int i = 0; i < arr6.length -1; i++) {
      if (i >= maxIdx ) {// 最大值係1位, 之前唔使改位置所以由i =1 改
        temp = arr6[i];
        arr6[i] = arr6[i+1];
        arr6[i+1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr6));//[4,3,2,1,5]

    //4,3,2,1,5 - >> 4,3,2,5,1
    for (int i=0; i < arr6.length; i++) {
      if (arr6[i] < min) {
        min = arr6[i];
        minIdx = i;
      }
    }
    for (int i=0; i < arr6.length -1; i++) {
      if (i >= minIdx) {
        temp = arr6[i] ;
        arr6[i] = arr6[i+1];
        arr6[i+1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr6)) ;//4,3,2,5,1

    //4,3,2,5,1 - > 1,4,3,2,5

    //reverse the string
    String str = "hello";
    //hello - > olleh
    char [] characters1 = str.toCharArray();
    char temp4 = ' ';
    for (int i = 0; i < str.length()/2 ; i++) {
      temp4 = characters1[i];
      characters1[i] = characters1[str.length() - 1 - i];
      characters1[str.length()-1-i] = temp4;
    }
    System.out.println(String.valueOf(characters1));

  }
}
