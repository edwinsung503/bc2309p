public class Square {

  int length ;
  //setter-> 可以後期改parameter
  public void setLength (int length) {
    this.length = length;
  }

  //Constructor Signature cannot be duplicated
  //All-arguements constructor (arguments -> parameters)
  public Square(int length) {
    this.length = length;
  }

  public Square() {}

  //area - > 有個holder own 住個length
  //好: 逼對方new 一個Object 再set length
  public int area() {
    return this.length * this.length;
    
  }
  public static int area(int length) {
    return length * length;// static 無this(無object 的概念)
  }
  public void abc() {
    System.out.println("hello, this is static abc method");
  }
  //method signature cannot be duplicated
  //method signature = method name + parameters 
  public static String abc(String s,String s2) {
    System.out.println("hello, this is static abc method"+ s + s2 );
    return s + s2;
  }

  public static void main(String[] args) {
    //new Square
    //Approach 1 - > setter
    Square square = new Square();//empty constructor - > 一開始無set length 
    square.setLength(2);//assign length into the square object
    System.out.println(square.area());

    //Approach 2
    Square square2 = new Square(3); //<-早期set 
    System.out.println(square2.area());//9 -> 用object 去call

    //Approach 3
    //Static method call;
    System.out.println(Square.area(5));//25 > 用class 去 call

    //revise square length;
    square.setLength(7);//
    System.out.println(square.area());//49

    //difference between instance method and static method
    //Instance method : new object first -> use the instance varibalbes to calculate -> 等於一個公用的秤, 俾所有人用
    //Static method : in and out - > 係一個工具
    square.abc();
    square2.abc();
    //String s = square2.abc() <- 唔可以因為void -> 無return , 唔可以用object reference 裝住


  }


}
