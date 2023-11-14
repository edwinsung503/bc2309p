import java.math.BigDecimal;
import java.util.ArrayList;

public class Customer {

  private String name;

  private ArrayList<Order> orders;

  public Customer (String name){
    this.name = name;
    this.orders = new ArrayList<>();

  }
  public boolean add(Order order){
    return this.orders.add(order);
  }
  
  public boolean isVip() {
    // >= 2 order && order total > 50
    return this.orders.size() >=2 && totalOrderAmount() > 50;
  }

  public double totalOrderAmount(){
    BigDecimal totalOrderAmount = BigDecimal.valueOf(0);
    for (Order order : this.orders) {
      totalOrderAmount = totalOrderAmount.add(order.total());
    }
    return totalOrderAmount.doubleValue();
  }



  public static void main(String[] args) {
    Customer customer = new Customer("John");
    Order order = new Order();
    order.add(new OrderItem(3,3.2));
    order.add(new OrderItem(2,5.2));
    customer.add(order);
    System.out.println(customer.totalOrderAmount());
    System.out.println(customer.isVip());

    Order order2= new Order();
    order.add(new OrderItem(5,3.1));
    order.add(new OrderItem(24,5.1));
    customer.add(order2);
    System.out.println(customer.totalOrderAmount());
    System.out.println(customer.isVip());


  }

}
