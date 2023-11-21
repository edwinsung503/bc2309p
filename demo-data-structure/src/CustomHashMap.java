import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomHashMap {

  public static void main(String[] args) {
    Map<Integer, OrderItem> itemMap = new HashMap<>();
    itemMap.put(1,new OrderItem(2, 3.4));
    itemMap.put(2,new OrderItem(4, 5.4));
    itemMap.put(3,new OrderItem(6, 7.4));

    OrderItem orderItem = itemMap.get(2);
    System.out.println(orderItem);
    System.out.println(orderItem.getUnitPrice());

    Map<Customer, List<Order>> cusMap = new HashMap<>();
    //放一個object(Customer)
    Customer c1 = new Customer("John");
    Customer c2 = new Customer("John");
    //唔同地址, 唔同object

    //equals method -> 收窄equal 的定義
    cusMap.put(c1, List.of(new Order(), new Order()));
    cusMap.put(c2, List.of(new Order(), new Order(), new Order()));//係依度call equals method 

    //佢會被自動call -> 幫.put 依個Method 去決定2個object 係咪相同,如果相同會override 舊的key
    System.out.println(cusMap.size());//2-> 1 when added equal & hashcode method
    System.out.println(cusMap.get(c1).size());//3
    System.out.println(cusMap.get(c2).size());//3

    //object reference 係equal 後無用




  }
}
