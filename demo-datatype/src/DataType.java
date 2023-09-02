public class DataType {
  public static void main (String [] args) {
    String box = "Hello World";// assisgned a value and declaration
    // Assign value "Hello World" to a variable box 
    // String << box << "Hello World"
    System.out.println(box);
    //Print the value of a varaiable 
    System.out.println("box");
    //Print the String value : box

    String str ;//Declaration 聲明
    box = "Welcome to Bootcamp"; //<< line 3 assigned box as a String
    str = "abc";//Assign value "abc" to a variable str
    System.out.println(str);// abc
    System.out.println(box);// Welcome to Bootcamp

    //Primitives 8 types in total (one king of data type)
    //int x = "abc"; //Type mismatch: cannot convert from String to 
    int x = 1 ; //assignment & declaration
    int salary = 1000; //assignment & declaration
    x = 10; 
    System.out.println(x); // 10
    //int 可以做加減
    x = x + 2 ;//Always look at the right hand side
    // x << x +2 
    // 10 + 2, assiagn 12 back to varialbe x 
    System.out.println(x);//12

    x = x - 8;
    System.out.println(x) ; // 4 (12 - 8) ,assign back to variable x 

    salary = salary + x;
    System.out.println(salary); // 1004 (1000+4)

    int z = salary / 2;
    System.out.println(z);// 502 (1004 / 2)

    int k = z * 5;
    System.out.println(k); //2510

    int sum = x + salary + z + k;//4 + 1004 + 502 + 2510
    System.out.println(sum);//4020

    int result = sum + 10 / 2;// 4020 + 5 
    System.out.println(result); //4025

    //self + 1
    int j = 0;
    j = j +1; // Approach 1
    j +=1;// Approach 2: same as j = j + 1, "= j +" -> "+="
    j++;// Approach 3
    ++j;// Approach 4
    System.out.println(j); // 4

    //String str = 1;//Not ok, cannot assign int to String variable 
    // Java > strong type(datatype)
    String s = "hello";
    // s = s / 2; // String cannot divide by 2
    // s = s * 2; 
    // s = s - 3; 
    s = s + "world.";// can add(合併) // String supports + operation
    System.out.println(s);//hello world.

    String str1 = "abc";
    String str2 = "xyz";
    String e = str1 + str2;
    System.out.println(e);//abcxyz
    System.out.println("e=" + e);//e=abcxyz "e=" << is a string

    // int -> Integer 整數
    //int a = 0.3;//cannot assign decimal to int variable
    double d = 0.3;
    d = 3.14567;
    System.out.println(d);//3.14567
    d = d + 0.3 - 0.1 * 2;
    System.out.println(d);//3.24567

    double d2 = 3;// asssign int to variable d2, then convert int to double
    System.out.println(d2); // 3.0

    // boolean (true OR false)
    boolean a = true;
    System.out.println(a);// true
    boolean isLeft = false;
    System.out.println(isLeft); //false
    //sysout - > short cut "System.out.println()"

    //String w = true; //cannot assign true/false to String variable 
    //boolean doesn't support +/-/*// operation
    boolean isMale = true;

    // char 
    char t = 'a';//single qoute, 單字, 放single character
    System.out.println(t);//a
    //char i = ''; //Not Ok, at least 1 character
    //char t = 'ab'; //Not Ok, not more than 1 character
    char o = '$';
    System.out.println(o);// $
    
    // byte
    byte b = 1; // within -128 to 127
    //byte b2 = -129;// out of range
    //byte b3 = 128;// out of range
    //b = b + 10; //byte +-*/ 轉做int

    //short 
    short sh = 128;
    //short sh2 = -40000;// Not ok, out of range
    //short sh3 = 40000;// Not ok, out of range
    int r2 = sh + 100; // 228 
    System.out.println("r2="+r2);// r2=228

    //long(a type has a big range than int)
    long l1 = 10000;
    l1 += 20000; // l1 = l1 + 20000;
    System.out.println(l1); //30000
    
    l1 -= 5000; // l1 = l1 -5000;
    System.out.println(l1); //25000

    l1 *= 2; // l1 = l1 *2;
    System.out.println(l1);//50000

    l1 /= 10; // l1 = l1 / 10;
    System.out.println(l1);//5000

    //String supports +=
    String k2 = "abc";
    k2 += " bcd"; // k2 = k2 + " bcd";
    System.out.println(k2);//abc bcd

    //float 
    int i = 1;//By default, Java treat 1 is an integer value 
    double d4 = 3.0;//By default, Java treat 3.0 is a double value 
    double d5 = 3.0d;// Explicitly assign a double value to a variable value
    //float f = 3.0;//Not ok, By default, Java treat 3.0 is a double value , need to assign a float value to a variable value 
    float f = 3.0f;//

    //byte, short, int, long -> all of them handle Integer
    //Size : byte<short<int< long
    byte b3 = 3;//Not 3b
    short s3 = 4;//Not 4s
    int i3 = 5;//default int value
    long l4 = 5;// (upcast), you can ignore today
    long l5 = 5L;//Assisgn long value 5 to long variable

    //8 Primitive + String <
  }
}