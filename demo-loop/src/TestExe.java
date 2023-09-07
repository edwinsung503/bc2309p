public class TestExe {
  public static void main(String[]args) {
    int numbs = 0;
    for (int i =1; i <= 11 ; i++) {
      if ((i < 3) && ( i % 2 == 0)) {
        numbs += i ;
        //i = 1, pass
        //i = 2, 1+2=3
        //System.out.println("Stage 1 numbs: "+i+"th: "+numbs);
        
      } else if ((i < 7) && ( i % 2 == 1)){
        numbs += i ;
        //i = 3, 3+3 = 6
        //i = 4, pass
        //i = 5, 6+5 = 11
        //i = 6, pass
        //System.out.println("Stage 2 numbs: "+i+"th: "+numbs);
      } else if  ((i < 12) && (i % 3 == 0)){
        numbs += i ;
        //i = 7, pass
        //i = 8, pass
        //i = 9, 11+ 9= 20
        //i = 10, pass
        //i =11, pass
        //System.out.println("Stage 3 numbs: "+i+"th: "+numbs);
      } // 無包哂所有變數, 唔work
    }
    //System.out.println("numbs: "+numbs);
    int num = 0;

    for (int i =1; i <= 11 ; i++){
      if (i < 3 ) {
        if (i % 2 == 0){
          num += i;
          //i = 1, pass
          //i = 2, 0 + 2 = 2
        }
      } else if ( i < 7) {
        if (i % 2 == 1){
          num += i;
          //i = 3, 2 + 3 = 5
          //i = 4, pass
          //i = 5, 5 + 5 =10
          //i = 6, pass
        }
      } else {
        if (i % 3 == 0){
          num += i;
          //i = 7, pass
          //i = 8, pass
          //i = 9, 10 + 9 = 19
          //i = 10, pass
          //i = 11, pass
        }
      }
    }
    //System.out.println("num: "+num);

    //sum of 3,6,9,12,15
    int sum1 = 0;

    for (int i = 1; i < 16 ; i++) {
      if (i % 3 == 0) {
        sum1 += i;
      }
    }
    //System.out.println(sum1);

    // Write a program that prints the numbers from 1 to 100, 
    //but for multiples of three print &quot;Fizz&quot; 
    //instead of the number and for multiples of five print &quot;Buzz&quot;
    //For numbers which are multiples of both three and five print &quot;FizzBuzz&quot;.
    int sum2 = 0;

    for (int i =1; i <= 100; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        //System.out.println(i+"th: &quot;FizzBuzz&quot");
      } else if (i % 5 == 0) {
        //System.out.println(i+"th: &quot;Buzz&quot");
      } else if  (i % 3 == 0) {
        //System.out.println(i+"th: &quot;Fizz&quot");
      } else {
        //System.out.println(i+"th");
      }

    }
    //減數 10,8,6,4,2

    int minus = 100;

    for (int i = 1; i < 11; i++) {
      if (i % 2 ==0) {
        minus -= i;
      }
    }
    //System.out.println(minus);//70
    int sum = 0;
    int multiples = 0;
    //sum of 1,4,9,16,25,36,49,64,81
    for (int i = 1; i < 10; i++){
      multiples = i*i ;
      sum += multiples;
    }
    System.out.println(sum); //285


    
  }
}
