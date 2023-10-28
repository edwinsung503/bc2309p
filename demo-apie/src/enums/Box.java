package enums;

public class Box {

  private Color color ;

  public static final int SIZE = 100;

  //create a contructor
  public Box (Color color) {
    this.color = color ;
  }
  //getter
  public Color getColor(){
    return this.color;
  }

  //setter
  public void setColor (Color color){
    this.color = color;
  }

  

  public char getColorCode(){//instance method -> 可以用this.color 揾到color 個object
    return this.color.getCode();
  }

  public static void main(String[] args) {
    Box box = new Box (Color.BLUE);// Color is not a class, it is a enum, 
    //有D 似static final variable
    //color 係enum -> 無得new 
    //只有class 先可以new
    //enum 同primitives 用== 去check
    //Primitive & enum shoud be always compared by using "=="
    //Wrapper class & custom class shd be always compared by "equal()"
    if (box.getColor() == Color.BLUE){
      System.out.println("this box color is Blue");
    }
    
    box.setColor(Color.WHITE);
    if (box.getColor() == Color.WHITE){
      System.out.println("this box color is White");
    }

    box.getColor().getCode();//box.getColor() = Color -> 再揾color 係揾邊個code
    System.out.println("Box Color's code="+ box.getColor().getCode());//W
    System.out.println("Box Color's code="+ box.getColorCode());//-> print W < 好少用 

    //built in method 去拎description -> .name() method -> BLUE
    System.out.println(Color.BLUE.name().toLowerCase());//blue

    //.values()-> Color [] array
    //for-each
    for (Color color : Color.values()) {//values -> Color [] array
      //System.out.println(color.getCode());
      //System.out.println(color.getDescription().toLowerCase());
      System.out.println(color.name()+" "+color.getCode());

    }

    //valueOf() -> //Class.valueOf()
    System.out.println(Color.valueOf("WHITE"));

    System.out.println(Box.SIZE);

    


  }
}
