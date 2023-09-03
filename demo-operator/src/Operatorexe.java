public class Operatorexe{
  public static void main(String[]args){
    int i = 1;
    i = i + 2;
    i += 3 ;
    i++;
    ++i;
    System.out.println(i);// 8

    int x = 1;
    int result = x++;
    System.out.println("result : "+result);//1
    System.out.println("x : "+x);//2

    int y = 1;
    int result2 = ++y;
    System.out.println("result2 : "+result2);//2
    System.out.println("y : "+y);//2

    int z1 = 1;
    int result3 = z1--;
    System.out.println("result3 : "+result3);//1
    System.out.println("z1 : "+z1);//0

    int z2 = 1;
    int result4 = --z2;
    System.out.println("result4 : "+result4);//0
    System.out.println("z2 : "+z2);//0

    int r = 7 % 3;
    System.out.println(r); //1

    int w = 11 % 2 + 8 * 2;
    System.out.println(w); //17

    boolean b10 = (true && false); // false
    boolean b11 = !true || !false;// true
    boolean b12 = !true && !false;// false
    System.out.println(b12);

    boolean combine = (10 -2) < 1 && (100 +1) > 22 || (39 - 2) < 1 ;// false && ture || false -> false
    boolean combine2 = (12 - 10) ==2 && 3 * 4 < 100 || 4 > 10; //true  && true || false -> ture

    int a = 100;
    int b = 2;
    int c = 13;
    a *=23; //2300
    b /=2; // 1
    c %=2; // 1

    System.out.println("a: "+a+" b: "+b+" c: "+c);
    
    

  }
}