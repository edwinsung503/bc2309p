public class Examples {
  
  //when x =5, return 5+4+3+2+1
  //method 自己call 返自己  
  public static int sum(int x) {
    //Recursion<<<
    //Base criteria
    if (x ==1){
      return 1;//sum(1)-> 1
    }
    return x + sum(x-1);
    //5 + sum(4);
    //4 + sum(3);
    //3 + sum(2);
    //2 + sum(1);
    //> sum(1)-> 1

  }

  public static int sum2(int y){
    for (int i=0; i< y ; i++){
      y += 1;
    }
    return y;
  }
  public static void main(String[] args) {
   //Example example = new Example();
   //System.out.println(example.sum(5)); 
   System.out.println(Examples.sum(5));
   System.out.println(Examples.sum2(5));
  }
}
