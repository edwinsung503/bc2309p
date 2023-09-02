public class Operator {
  public static void main(String[] args) {
    //+-*/
    //++

    //--
    int i = 0;
    i = i - 1; //-1
    i -=1; // -2
    i --;// -3
    --i;//-4

    // ++, -- precedence
    int x = 0;
    int result = x++;//1
    System.out.println("result="+result);//result = 0
    System.out.println("x="+x);//x =1

    int y = 0;
    int result2 = ++y;
    System.out.println("result2="+result2);//result2 = 1
    System.out.println("y="+y);//y =1

    int z = 1;
    int result3 = z--;//0
    System.out.println("result3="+result3);//result3 = 1
    System.out.println("z="+z);//z =0

    int z2 = 1;
    int result4 = --z2;//1
    System.out.println("result4="+result4);//result4 = 0
    System.out.println("z2="+z2);//z2 =0


    // %, 講:5餘2=1
    int r = 5 % 2;//1 > 5 / 2 , 餘數=1 , the reminder of 5 / 2 
    System.out.println(r);//1

    int w = 10 % 6 + 4 * 8;// 10 / 6 餘 4  + 4*8 = 4+ 32 = 36
    System.out.println(w);//36

    // && ||
    boolean b = true && true;// true
    boolean b2 = true && false;//false
    boolean b3 = false && true;//false
    boolean b4 = false && false;//false
    
    boolean b5 = true || true;// true
    boolean b6 = true || false;//true
    boolean b7 = false || true;//true
    boolean b8 = false || false;//false

    //&& will go first - > false && true -> false
    // || ->true || false -> true
    boolean combine = true || false && true;// 行&&先到|| -> true || false ->true

    // !
    boolean b9 =!false;//true
    int h = (1 + 2) * 10;//30
    boolean b10 =!(true && false);//false false -> true

    //int h2 = [10 - (1 + 2)] * 4;
    int h2 = (10 - (1 + 2)) * 4;

    // > , < , >=, <=
    boolean g = 5 > 3;//true
    boolean g2 = 5 >= 6;//false
    boolean g3 = -1 < 1;//true
    boolean g4 = -2 <= -3;//false

    // == -> check if the values are same in both sides
    // = -> assignment 
    // != -> Not equals to
    boolean combine2 = (4 + 3) > 5 || (10 * 2) % 3 == 2; //true || true -> 
    System.out.println(combine2);
    boolean combine3 = !(5 % 2 == 1) && 10 * 3 != 20;//false && true -> false
    System.out.println(combine3);
    
    // *=, /=, %=
    int a = 2;
    a *= 3; //a = a * 3;
    System.out.println(a);//6
    int f = 3;
    f /=1;// f = f / 1;
    System.out.println(f);//3
    int e = 10;
    e %= 3; // e = e / 3  , remain 1
    System.out.println(e); //1
  }
}