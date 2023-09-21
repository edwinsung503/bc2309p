public class Calculator {
  int x;

  int y;

  public void setX(int x) {
    this.x = x;
  }

  public void setY (int y) {
    this.y = y;
  }

  public int add() {
    return this.x + this.y;
  }

  public char grade(){
    if (this.x > 150) {
      return 'A';
    }
    return 'F';
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setX(100);
    calculator.setY(300);
    System.out.println(calculator.add());//400
    Calculator calculator2 = new Calculator();
    calculator2.setX(200);
    calculator2.setY(400);
    System.out.println(calculator2.add());//600
    System.out.println(calculator2.grade());//A
    Calculator.add(3,4);//7
    

  }
}
