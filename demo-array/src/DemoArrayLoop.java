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
    System.out.println(max);
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

    for (int i = num.length - 1; i >= 0 ; i--) {
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
    char [] characters = str.toCharArray();
    for (int i = 0 ; i < characters.length; i++) {
      //System.out.println(characters[i]);
    }
    //when found 'o', replace it by z
    //print str
    //ans: hellz wzrld
    String newStr = "";
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

  }
}
