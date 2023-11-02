package shapes;

import java.math.RoundingMode;
import java.math.BigDecimal;
import enums.Color;

public class Trapezoid extends Shape{

  private double upperLine ;
  private double lowerLine;
  private double base;
  private double height;

  public Trapezoid(double upperLine, double lowerLine, double height, Color color) {
    super(color);
    this.upperLine = upperLine;
    this.lowerLine = lowerLine;
    this.height = height;
  }
  public void setBase(double base){
    this.base =base;
  }
  public double getUpperLine (){
    return this.upperLine;
  }
  public double getLowerLine(){
    return this.lowerLine;
  }

  public double getHeight(){
    return this.height;
  }

  public double area(RoundingMode mode, int dp) {
    BigDecimal tUpperLine = BigDecimal.valueOf(this.upperLine);
    BigDecimal tLowerLine = BigDecimal.valueOf(this.lowerLine);
    BigDecimal tBase = BigDecimal.valueOf(2.0);
    BigDecimal tHeight = BigDecimal.valueOf(this.height);
    return tUpperLine.add(tLowerLine).divide(tBase).multiply(tHeight).setScale(dp,mode).doubleValue();

  }

  
}
