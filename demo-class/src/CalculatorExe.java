public class CalculatorExe {
  int x;
  int y;

  public void setX(int x){
    this.x = x;
  }

  public void setY(int y) {
    this.y = y; 
  }
  public int area(){
    return this.x * this.y;
  }

  public static int area(int x, int y){
    return x * y;
  }



  public static void main(String[] args) {
    CalculatorExe calculatorExe1 = new CalculatorExe();
    //instance method
    calculatorExe1.setX(10);
    calculatorExe1.setY(2);
    System.out.println(calculatorExe1.area());//20
    //Static method
    System.out.println(CalculatorExe.area(10,12));//120
  }

}


