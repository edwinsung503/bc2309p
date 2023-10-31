package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

public class Square extends Shape {

  private double length;

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
  public double area(RoundingMode mode, double length){
    BigDecimal sLength = BigDecimal.valueOf(this.length);
    return sLength.multiply(sLength).setScale(length, mode).doubleValue();
  }
  
}
