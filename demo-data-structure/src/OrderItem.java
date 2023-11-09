import java.math.BigDecimal;

public class OrderItem {
  
  private int quantity;

  private double unitPrice;

  public OrderItem (int quantity, double unitPrice) {
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public int getQuantity (){
    return this.quantity;
  }

  public double getUnitPrice(){
    return this.unitPrice;
  }

  public BigDecimal total() {
    //return BigDecimal.valueOf(this.quantity).multiply(BigDecimal.valueOf(this.unitPrice)).doubleValue();
    return BigDecimal.valueOf(this.quantity).multiply(BigDecimal.valueOf(this.unitPrice));
  }

  public static void main(String[] args) {
    OrderItem item1 = new OrderItem(10,2);
    OrderItem item2 = new OrderItem(12,4);
    OrderItem item3 = new OrderItem(14,5);
    


  }
}
