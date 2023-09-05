public class TestBreak {
  public static void main(String[]args) {
    // step 1: i = 0;
    //step 2 : check if i < 10 ;
    //step 3: check if i > 2 ;
    //step 4 : i++;
    //step 5 : check if i < 10 ;
    //step 6: check if i > 2 ; 
    //step 7 : i++;
    //step 8 : check if i < 10 ;
    //step 9: check if i > 2 ; 
    //step 10: i++ -> i = 3
    //step 11: check if i <10;
    //step 12 : check if i > 2; -> true -> break the loop
    for (int i = 0 ; i < 10 ; i++) { // 0,1,2,3,4,5,6,7,8,9
      System.out.println(i);//0,1,2,3
      if (i  > 2) {
        break;
      }
     }
  }
}
