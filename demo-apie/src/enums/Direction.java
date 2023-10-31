package enums;

public enum Direction {
  
  EAST('E',1),
  NORTH('N',2),
  WEST('W',-1),
  SOUTH('S',-2),//(char code, int val) 配對 
  ;

  private char code;
  private int val;
  //似係constructor 但唔係俾你用, 所以係用private
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
    return this.val * -1 == direction.getVal();// 2個catergiory 的關係
    //This code means that you are defining a method to check if two directions are opposite. 
    //The method takes another direction as a parameter and returns a boolean value. 
    //It compares the result of the previous step with the value of the other direction. I
  } 
  

  public static void main(String[] args) {
    //
    System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH));//true
    //System.out.println(Direction.SOUTH.isOpposite(Direction.SOUTH));//false
    
  }



}
