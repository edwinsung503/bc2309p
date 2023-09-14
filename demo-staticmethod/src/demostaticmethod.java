public class demostaticmethod {
  public static void main(String[]args) {//-> static method , JVM - > run static main
    //set 好左call 1個method
    //System.out.println("Hello World");
    //for loop 無desciption
    int x =2;
    for (int i=0; i < 10; i++) {
      x *=2;
    }
    x = 10;
    for (int i=0; i < 10; i++) {
      x *=2;
    }
    int result = add(2,3);
    System.out.println(result);//5
    result = add(10,1000);
    System.out.println(result);//1010
    result = add(101,100);
    System.out.println(result);//201
    result = add(120,10);
    System.out.println(result);//130
    short r = sum(5,8);
    System.out.println(r);//26


  }
  //1st int - >  return type
  //add - > method name
  // (int x, int y) -> parameters
  public static int add(int x, int y) {//int - > retunr value - > int, x =2,y=3
    int result = x + y ;
    return result;
  }
  //min:5, max:8 - > sum =26
  public static short sum(int min, int max) {
    int total = 0;
    for (int i = min; i <= max ; i++) {
      total += i;
    }
    return (short) total; //downcast
  }
}
