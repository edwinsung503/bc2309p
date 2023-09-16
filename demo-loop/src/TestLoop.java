public class TestLoop {
  public static void main(String[]args) {
    int x = 2;
    x *=2;
    x *=2;
    x *=2;
    x *=2;
    x *=2;
    x *=2;
    x *=2;
    System.out.println(x);//256
    // loop - > for loop, while loop, do-while loop
    x =2; 
    //step 1: int i = 0
    //step 2: check if i < 7
    //step 3: x =x *2
    //step 4: i++; -> i become 1
    //step 5: check if i < 7
    //step 6 : x = x*2
    //step 7 : i++; i become 2
    //...
    // step n: i++; -> i become 6
    //step n +1 : check if i <7
    //step n + 2: x = x *2
    //step n + 3: i++; -> i become 7
    //step n + 4: check if i < 7 -> false - > exit loop
    // 0 , 1, 2, 3, 4, 5, 6 - > 7 次
    for (int i= 0 ; i < 7 ; i++) { 
      // step1: int i = 0 -> step2: i <7 -> step3 : i++
      // int i = 0 - > initialization / started from (counter from 0) (Not i = 1)
      // i < 7 - > countiune/check condition criteria (Not <=)
      // i ++ - > update
      x = x *2;
      System.out.println(i+": "+x);//print 7 times
    }
    System.out.println(x); //256
    //Quiz idea - > 似係其他primitives 
    //for (byte b = 0; b < 128 ; b ++) {
      //System.out.println(b); //0....127
      //when b = 127 -> b++ -> -128 -> -128 < 128 ?? - > infinite loop
    //}
    //Quiz idea
    for (byte b = 0; b >=0; b++) {
      System.out.println(b); //0....127
      //when b = 127 -> b++ -> -128 -> -128 >= 0 - > will stop
    }
    
  }
}
