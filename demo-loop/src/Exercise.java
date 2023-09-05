public class Exercise {
  public static void main(String[]args) {
    //1,2,3,4,5,6,7,8,9,10
    int sum = 0;
    
    for (int i = 1 ; i < 11 ; i++) { //
      //sum = sum + i;
      sum += i;
    }
    System.out.println(sum);//55
    int total = 0;
    // sum of 2,4,6,8,10
    //for loop, if 
    for (int i = 1 ; i < 11 ; i++) {
      if (i % 2 == 0) {
          total += i;
        System.out.println(i+": "+total);//30
      }
    }
    System.out.println(total);//30

    //1- 1000
    //1 - 299 (add all even number)
    //300 - 699 (add all odd number)
    //700 -1000(addd all numbers can be divided by 3)

    int num = 0;
    for (int i = 1 ; i <= 1001 ; i++) {
      if (i < 300 ) {
        if ( i % 2 == 0) {
          num += i ;
        }
      } else if (i < 700 ) {
          if ( i % 2 == 1) {
            num += i ;
          }
      } else  {
          if (i % 3 == 0) {
            num += i ;
          }
      }      
    }
    System.out.println(num);


    int numbers = 0 ;
    for (int i = 1 ; i <= 1001 ; i++) {
      if (i < 300 && (i % 2 == 0)) {
        num += i;
      }
    }
    System.out.println(numbers);

  }
}