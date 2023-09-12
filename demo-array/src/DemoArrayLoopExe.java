public class DemoArrayLoopExe {
  public static void main(String[]args) {
    int [] arrs = new int [] {100,109,1011,1005};
    for (int i =0; i < arrs.length; i++) {
      System.out.println("The "+i+"th: "+arrs[i]);//100,109,1011,1005
    }

    //Sum of arrs[i]
    int sum = 0;
    for (int i =0; i < arrs.length; i++) {
      sum += arrs[i];
    }
    System.out.println("Total: "+sum);//2225

    //Find the max value in the array
    int [] num = new int [] {100,109,1122,1005};
    int target = 0 ;
    for (int i =0 ; i < num.length; i++) {
      if (num[i] > target) {
        target = num[i];
      }
    }
     System.out.println("Max Value: "+target);//1122

    //find the min value in the array
    //target = 10000;
    for (int i = 0; i < num.length; i++) {
      if (num[i] < target) {
        target = num[i];
      }
    }
    System.out.println("Min Value: "+target);//100

    //Find the average of all the values in the array
    int [] num2 = new int [] {100,109,1122,1003};
    int sum2 = 0;
    for (int i = 0; i < num2.length; i++) {
      sum2 += num2[i];
    }
    double average = sum2 / num2.length;
    System.out.println("Average Value: "+average);//583.0

    //print 單數odd numbers in the array, from the tail of array
    for (int i = num2.length - 1; i >=0 ; i--) {
      if (num2[i] % 2 ==1) {
        System.out.println("The "+i+"th: "+num2[i]);//109,1003
      }
    }

    //print even numbers in the array, from the tail of array
    for (int i = num2.length - 1; i >=0 ; i--) {
      if (num2[i] % 2 ==0) {
        System.out.println("The "+i+"th: "+num2[i]);//100,1122
      }
    }

    //print index of value 0f 1003
    int [] num3 = new int [] {100,109,1122,1003,10};
    target = 1003;
    for (int i = 0; i < num3.length; i++) {
      if (num3[i] == target) {
        System.out.println("The index: "+i);
      }
    }
    //.toCharArray
    String str = "good bye class";
    char [] character = str.toCharArray();//***
    for (int i = 0; i < character.length; i++) {
      //System.out.println(character[i]);
    }
    //when found 'b', replace it by m
    //when found 'y', replace it by o
    //when found 'e', replace it by r
    //print str
    //ans: good mor class
    String str1 = "";
    for (int i = 0; i < character.length; i++) {
      if (str.charAt(i) == 'b') {
        str1 += 'm';
      } else if (str.charAt(i) == 'y') {
        str1 += 'o';
      } else if (str.charAt(i) == 'e') {
        str1 += 'r';
      } else {
        str1 += character[i];
      }
    }
    System.out.println(str1);//good mor class
    // Approach
    //String.valueOf
    String str2 = "";
    for (int i = 0; i < character.length; i++) {
      if (character[i] == 'b') {
        character[i] = 'm';
        str2 += character[i];
    } else if (character[i] == 'y') {
        character[i] = 'o';
        str2 += character[i];
      } else if (character[i] == 'e') {
        character[i] = 'r';
        str2 += character[i];
      } else {
        str2 += character[i];
      }
    }
    System.out.println(String.valueOf(character));//good mor class
  }
}
