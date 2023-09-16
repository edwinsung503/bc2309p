public class StringDemo {

  // Keypoints:
  // Method Signature : method name + (optional) parameter(s)
  // Method Signature can be duplicated in a class
  // Method Return Type (Class or primitive or Array ...) 
  // With Method Code Block: you should always return a value for all scenario
  // The type of return value should match the return type of the method
  // Void -> make sure understand why we need "void "in method return type
  public static void printString(String str) {// void 係用來頂住method 個return type ->> int / string
    if (str.length() > 3) 
      return;
    System.out.println("str="+str);
    System.out.println("str="+str+str);
    return;
  }

  public static String print(String str) {
    return str + "world";
  }
  public static int print2(String str) {
    return str.length();//輸入任何文字都可以輸出數字
  }
  public static String print(String str1, String str2) {
    //early return
    if (!str1.equals(str2)) {//if str1 not equal str2
      return str1 + str2;
    } 
    if (str1.length() > str2.length()) 
      return str1;
    //如果code block 入面得1句, 可以唔打{}< 分號計
    return str2;// 一定要有野有return - > 所以要有return
    //如果上面無野return 就return str2
  }
  
  public static void main(String[]args) {
    String str = "Hello";
    System.out.println(StringDemo.print(str));//Helloworld
    System.out.println(StringDemo.print2(str));//5

    StringDemo.printString("abce"); //str=abce < -- return keyword 做左就唔會再行落去，會離開個program
    StringDemo.printString("abc");// 如果無大過3就離開
  }
}
