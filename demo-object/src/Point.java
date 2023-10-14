import java.util.Objects;

public class Point {
  
  private int x;

  private int y;//因為private 左所以要用setter/getter 去access 到個x同y


  public void setX (int x) {
    this.x =x;
  }
  public void setY (int y) {
    this.y =y;
  }

  public int getX(){
    return this.x;
  }

  public int getY () {
    return this.y;
  }

  public Point(int x, int y){
    this.x = x;
    this.y =y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Point)){
      return false;
    }
    Point point = (Point) obj;
    return Objects.equals(this.x,point.getX())
      && Objects.equals (this.y,point.getY());

  }
  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }

  //public Point () {} < - 唔想有人可以set 無 x y 

  //move to right

  public Point Right() {
   this.x += 1;
   return this;//如果要係咁寫chain 先會要寫return this(return POINT)
  }

  public Point Left(){
    this.x -=1;
    return this;
  }

  public Point Up(){
    this.y +=1;
    return this;
  }

  public Point Down(){
    this.y -=1;
    return this;
  }
  @Override
  public String toString(){
    return "Point (x= "+this.x + ", y= "+this.y+" )";
  }


  public static void main(String[] args) {
    Point point = new Point(0,0);
    Point point2 = new Point (0,1);
    Point point3 = new Point(0,1);

    System.out.println(point2.equals(point3));//true
    System.out.println(point.equals(point2));//true

    point.Right();
    point.Up();
    point.Left();
    point.Up();

    System.out.println(point.toString());
    System.out.println(point.hashCode());

    point.Right().Up().Left().Up();//???
    //return Point/this
    System.out.println(point);//0,2

    point.Right();//Java doesnt require to receive the return object from method
    point.Up();

    System.out.println(point);//1,3

    Point.rightAndUp(point);//2,4-> 俾地址你去做野
    System.out.println(point);//2者object reference 指同一個ojbect
    

    String s ="hello";
    String s2 = Point.concatA(s);
    System.out.println(s2); //helloA
  }
  //exe change to instance method
  public static void rightAndUp(Point point){//Pass by reference(地址)
    point.setX(point.getX()+1);
    point.setY(point.getY()+1);
    //return point;// return point 係多餘, 可以唔使return -> 仲要俾你個地址人?
    //return type 唔一定要揾野接住
  }

  public static String concatA (String str) {//pass by value (all 9 Wrapper Class) (),要有helloA, 只可以return String
    str = str + "A";
    return str;
  } 


  //17 個class 都係passed by value, 其他自己起的class 先係pass by reference
}
