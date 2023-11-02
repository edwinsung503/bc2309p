package shapes;

import java.math.RoundingMode;
import java.math.BigDecimal;
import enums.Color;

public class Rectangle extends Shape{

  private double length;
  private double height;

  public Rectangle (double length, double height, Color color){
    super(color);
    this.length = length;
    this.height = height;
  }

  public double getLength(){
    return this.length;
  }

  public double getHeight() {
    return this.height;
  }

  @Override // RoundingMode -> Floor / dp decimal place 
  public double area(RoundingMode mode, int dp) {
    BigDecimal rLength = BigDecimal.valueOf(this.length);
    BigDecimal rHeight = BigDecimal.valueOf(this.height);
    return rLength.multiply(rHeight).setScale(dp,mode).doubleValue();
  }

}
