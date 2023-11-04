package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

public class Square extends Shape {

  private double length;

  //create a self constructor
  public static Square valueOf(double length, Color color) {
    return new Square (length);
  }

  public Square (double length, Color color){
    super(color);
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }
  public void setLength(int length){
    this.length =length;
  }

  @Override
  public double area(RoundingMode mode, int dp){
    BigDecimal sLength = BigDecimal.valueOf(this.length);
    return sLength.multiply(sLength).setScale(dp, mode).doubleValue();
  }
  
}