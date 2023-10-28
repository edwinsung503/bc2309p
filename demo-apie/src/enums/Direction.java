package enums;

public enum Direction {
  
  EAST('E',1),
  NORTH('N',2),
  WEST('W',-1),
  SOUTH('S',-2),
  ;

  private char code;
  private int val;

  private Direction (char code, int val){
    this.code = code;
    this.val = val;
  }

  public char getCode(){
    return this.code;
  }

  public int getVal (){
    return this.val;
  }

  //assign a int value to the enum
  public boolean isOpposite (Direction direction) {
    return this.val * -1 == direction.getVal();
    //-2 * 1 == 2 ??
  } 
  

  public static void main(String[] args) {
    System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH));//true
    System.out.println(Direction.SOUTH.isOpposite(Direction.SOUTH));//false
    
  }



}
