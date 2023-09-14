public class demowhile {
  public static void main(String[]args) {
    for (int i=0; i < 5; i++) {//for loop as a countering - > will be easier to see/present
      System.out.println(i);
    }

    
    //while loop
    int j = 0;
    int k = 10;
    while (j < 5 && k > 0) { //more flexible , as when use if else 
      System.out.println(j);
      j ++;// 令佢會停
      k--;
      System.out.println("hello");
    }

    //SUm: 1 - 10
    int sum =0;
    for (int i=1; i < 11; i++) {
      sum += i;
    }
    System.out.println(sum);//55
    
    sum = 0;
    j = 1;
    while (j < 11 ) {
      sum += j;
      j++;
    }
    System.out.println(sum);//55

    //sum ;even 2,4,6,8,10
    j = 1;
    sum =0;
    while (j < 11) {// while (++ j < 11)
      if (j % 2 ==0) {
        sum += j;
      }
      j++;
    }
    System.out.println(sum);//30

    //do-while
    int count =0;
    do  {//點都會行一次
      System.out.println("count="+count);
    } while (++count < 5);//加完先再作compare

    //做左一次先再check count < 5, for loop -> check 左先再行
    //可以用以個地方做Stop

    //break - > 
    // 1 - 10, odd number and > 6
    //print 7,9
    j = 10;
    //while (j > 6) {// 唔break 的方法
    while (true) { //always fulfill 
      if (j % 2 == 1) {
        System.out.println(j);
      } 
      if (--j <=6) {
        break;
      }
    }
  }
}
