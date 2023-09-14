import java.util.Arrays;

public class DemoArrayLoop {
  public static void main(String[]args) {
    int [] num = new int[4];
    num[0] = 100;
    num[1] = 109;
    num[2] = 10212;
    num[3] = 1005;

    for (int i = 0; i < 4; i++) {//0,1,2,3
      System.out.println(num[i]);
    }
    //better choice -> 4 convert to use (num.length)
    for (int i = 0; i < num.length; i++) {//0,1,2,3
      System.out.println(num[i]);
    }

    //sum  of num[i]
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    System.out.println(sum);//2214


    //Find the max value in the array
    int max = -1;
    //boolean isMax = false;
    for (int i = 0; i < num.length; i++) {
      if (num[i] > max) {// 用個代數，如果大過就改左個max variable
        max = num[i];
      }
    }
    System.out.println("max: "+max);
    //find the min value in the array

    //int min = num[0];
    int min = 10000;
    for (int i = 0; i < num.length; i++){//times
      if (num[i] < min) {
        min = num[i];
      }
    }
    System.out.println("min: "+min);

    //Find the average of all the values in the array

    double average = 0;//average 最好用double(因為可能除唔盡)
    int sum1 = 0;
    for (int i = 0; i < num.length ; i++) {
     sum1 += num[i] ;
    }
    average = sum1 / num.length;
    //double average = sum1 / num.length;
    System.out.println("Sum: "+sum1);
    System.out.println("Average: "+average);
    
    //print 單數odd numbers in the array, from the tail of array

    for (int i = num.length - 1; i >= 0 ; i--) {//***/ i >= 0***
      if (num[i] % 2 == 1) {
        System.out.println(num[i]);
      }
    }

    //
    int [] integers = new int[] {100,3,10,5,-100};
    int target = 10;
    //print index of value 0f 10
    for (int i = 0; i < integers.length ; i++) {
      if (integers[i] == target) {
        System.out.println("The index of target: "+i);
      }
    }
    

    String str = "hello world";
    char [] characters = str.toCharArray();//由string 轉至char Array (逐個字分柝開1個位)
    for (int i = 0 ; i < characters.length; i++) {
      System.out.println(characters[i]);
    }
    //when found 'o', replace it by z
    //print str
    //ans: hellz wzrld
    String newStr = "";// 開一個新varaible 去裝住新字
    for (int i = 0; i < characters.length; i++) {
      if (str.charAt(i) == 'o') {
        newStr += 'z';
      } else {
        newStr += str.charAt(i);
      }
    }
    System.out.println(newStr) ;

    //Approach 2
    String str2 = "";
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == 'o') {
        characters[i] = 'z';
      }
    }
    System.out.println(String.valueOf(characters)) ;//char [] -> string
    //String.valueOf < - new function
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == 'o') {
        characters[i] = 'z';
        str2 += characters[i]; 
      }
    }
    System.out.println(String.valueOf(str2)) ;

    String u = String.valueOf(1); // 1 -> "1" << 新function(String.valueOf) 可以將數字改為文字

    int [] nums2 = new int [] {1,101,-1000,-3,4};
    int minIndex = 0;
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] < nums2[minIndex]) {
        minIndex = i ;
      }
    }
    int temp = nums2[minIndex];//temp = nums[2]
    nums2[minIndex] = nums2[nums2.length-1];//nums[2] = nums[4] -> 將最後的數字改為頂替minindex 果個
    nums2[nums2.length-1] = temp; // nums[4] = temp = nums[2] = -1000 -> 放minindex 個數字去最後位置
    System.out.println(Arrays.toString(nums2));//[1, 101, 4, -3, -1000]
      


  }
}
