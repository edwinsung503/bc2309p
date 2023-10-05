public class SquareExe2 {
  
  int length;

  //setter
  public void setLength(int length) {
    this.length = length;
  }
  //getter
  public int getLength () {
    return this.length ;
  }
  //constructor
  public SquareExe2(int length) {
    this.length = length;
  }
  //empty constructor
  public SquareExe2 (){}
  //method
  public int area () {
    return this.length * this.length;
  }

  public static int area(int length) {
    return length * length;
  }
  public static void main(String[] args) {
    //instance method 
    SquareExe2 square = new SquareExe2();
    square.setLength(10);
    System.out.println(square.area());
    //static
    System.out.println(Square.area(2));
  }
}
