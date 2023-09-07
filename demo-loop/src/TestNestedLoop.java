public class TestNestedLoop {
  public static void main(String[]args) {
    for (int i = 0; i < 5 ; i++) {//i
      //i = 0
      for (int j = 0; j < 5 ; j++) {//j
          // i = 0, j = 0, print i => 0
          // j ++
          // i = 0, j = 1, print i => 0
          //...
          // i = 0, j = 4, print i => 0
          System.out.println("i="+i+" j="+j); // i -> 5*5 
          //i = 0, j =0
          //i = 0, j =1
          //i = 0, j =2
          //i = 0, j =3
          //i = 0, j =4 
          //i = 0, j =5
      }//j
    }//i

    // i - > 1-10
    // j - > 11 -20
    //Print the statement, when i & j are both even number
    // one more condition: j < 15
    for (int i = 1 ; i < 11 ; i++) {
      for (int j = 11 ; j < 21 ; j++) {
        //要留意點樣可以提早離開
        if (j >= 15) {
          break;// break the nested loop (入面果個(inner)loop)
        }
        if (i % 2 ==0 && j % 2 ==0) {
          System.out.println("i="+i+" j="+j);
        } 
      }
    }

    //Approach 2
    for (int i = 1 ; i < 11 ; i++) {
      for (int j = 11 ; j < 21 ; j++) {
        //要留意點樣可以提早離開
        //if ( i % 2 ==0 && j % 2 ==0 && j < 15) {// 放前面會行先, 會check 條件係咪可以, 唔可以放會停唔再做
        if (j < 15 &&  i % 2 ==0 && j % 2 ==0 ) {// 會繼續試j =16,17,18,19...所以比較approach 1 慢
          System.out.println("i="+i+" j="+j);
        } 
      }
    }

  }
}

//when i = 0,
// enter another loop (j counter)
// i = 0, j = 0, print i => 0
// j ++
// i = 0, j = 1, print i => 0
//...
// i = 0, j = 4, print i => 0
