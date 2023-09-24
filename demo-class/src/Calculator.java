public class Calculator {//只可生產calculator 的object 但唔可以生產book object
  private int x;

  private int y;

  private int z;

  public void setX(int x) {
    this.x = x;
  }

  public void setY (int y) {
    this.y = y;
  }

  public int add() {
    return this.x + this.y;
  }

  public int bmi() {
    //Calculator c3 = new Calculator ;
    //c3.setX(100)
    //c3.setY(90);
    //c3.setZ(90);
    //call c3.bmi() //10
    return this.x + this.y + this.z;
  }
  public int substract(){
    //Calculator c = new Calculator ;
    //c1.setX(100)
    //c1.setY(90);
    //call c1.substract() //10
    //Calculator c2 = new Calculator ;
    //c2.setX(12)
    //c2.setY(10);
    //call c2.substract() //2
    return this.x-this.y;
  }

  //For static method, usually we have parameters _> 唔可以call this 因為太多object
  public static int substract2(int x, int y) {//公家野- > 無得this.
  //Calculator.substract2(10,3)
    return x - y;
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
