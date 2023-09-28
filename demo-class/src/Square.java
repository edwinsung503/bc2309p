public class Square {

  int length ;
  //setter
  public void setLength (int length) {
    this.length = length;
  }

  //Constructor Signature cannot be duplicated
  public Square(int length) {
    this.length = length;
  }

  public Square() {}

  //area
  public int area() {
    return this.length * this.length;
  }
  
  public static void main(String[] args) {
    //new Square
    //Approach 1 - > setter
    Square square = new Square();//empty constructor
    square.setLength(2);//assign length into the square object
    System.out.println(square.area());

    //Approach 2
    Square square2 = new Square(3);
    System.out.println(square2.area());//9

  }


}
