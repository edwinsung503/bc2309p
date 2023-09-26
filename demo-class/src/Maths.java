public class Maths {//Math 係一個工具
  public static void main(String[] args) {
    Math.min(19,7);//7
    Math.max(12,19);//19
    Math.abs(-7);//7
    Math.abs(7);//7
    Math.pow(2,10);//1024
    System.out.println((int) Math.pow(2,10));//小數
    System.out.println(Math.sqrt(8));//2.8284271247461903
    System.out.println(Math.floor(9.9));//9.0
    System.out.println(Math.ceil(9.2));//10.0 < 大過9.2的smallest integer

    System.out.println(Math.round(5.44));//5
    System.out.println(Math.round(5.45));//5
    System.out.println(Math.round(5.5));//6

    System.out.println((int) Math.random()* 1000 );//0 - 1(exclusive)

    Maths.pow(2.0,2);//自己寫的method 4.0
    Maths.pow(3.0,4);//81
    Maths.pow(3.0,1);//9
    Maths.min(3,1);//1
    Maths.min(3,3);//3


    
  }

  public static int min(int a, int b) {
    //if (a > b )
      //return b;
    //return a;
    return a > b ? b : a;// b : a - > b 係細過a
  }

  //public static int floor ()// <- homework
  //public static int abs () // <- homework


  public static double pow (double base, int power) {//assume base > 0 , power > 0
    if (base < 0)
      return 0.0;
    if (power ==0)
      return 1.0;
    if (power ==1)
      return base;
    double result = 0.0;
    for (int i = 2; i<= power; i++) {//起步已經係2
      result *= base;
    }
    return result;
  }

  //Must reember -> power, floor
}
