public class demowhileExe {
  public static void main(String[]args) {
    //while-loop

    int a = 0;
    int b = 10;
    while (a < 10) {
      a++;
      //System.out.println(a);
    }
    a = 0;
    b = 10;
    while (a < 4 && b > 0){
      a++;
      b--;
      //System.out.println(a+" "+b);
    }
    //Sum : 2 - 11
    int sum = 0;
    int c = 2 ;
    while (c < 12) {
      sum += c;
      c++;
    }
    System.out.println(sum);//65

    //sum : odd no 1,3,5,7,9,11
    sum =0;
    int d = 1;
    while (d < 12) {
      if ( d % 2 ==1) {
        sum += d;
      }
      d ++;
    }
    System.out.println(sum);//36

    //do - while
    int counter = 0; 
    do {
      System.out.println(counter); // 0
    } while (++counter < 3) ; //1,2
    //BREAK
    //2-12, add num and > 7
    d = 11;
    while (true) {
      if ( d % 2 == 1) {
        System.out.println(d);
      }
      if (--d <= 7) {
        break;
      }
     } 

     int e = 12;
     while (true) {
      if (e % 2 ==0) {
        System.out.println(e);
      }
      if (--e <= 5) {
        break;
      }
     }
  } 
}
