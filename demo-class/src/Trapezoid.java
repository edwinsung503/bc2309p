public class Trapezoid {
  int length;
  int height;
  int base;

  public void setLength(int length) {
    this.length = length ;
  }

  public void setHeight (int height) {
    this.height = height;
  }

  public void setBase (int base) {
    this.base = base;
  }

  public Trapezoid(int length,int height, int base) {
    this.length = length;
    this.height = height;
    this.base = base;
  }

  public Trapezoid(){}

  public int area(){
    return (this.length + this.base) * this.height / 2;
  }

  public static void main(String[] args) {
    Trapezoid trapezoid = new Trapezoid();
    trapezoid.setLength(2);
    trapezoid.setHeight(4);
    trapezoid.setBase(6);
    System.out.println(trapezoid.area());//16

  }

  
}
