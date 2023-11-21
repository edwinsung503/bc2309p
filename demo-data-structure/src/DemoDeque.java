import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
  
  public static void main(String[] args) {
    
    //Interface(Deque)
    Deque<Customer> customers = new LinkedList<>();
    //hide the methods of List, it only contains Deque methods
    //Customer customers = new Customer(null)
    //new a object call Customer
    customers.add(new Customer("John"));
    customers.addFirst(new Customer("Mary"));
    customers.addLast(new Customer("Peter"));
    customers.addLast(new Customer("Tommy"));//same as addLast()
    System.out.println("Add: "+customers);
    //[Customer@28a418fc, Customer@5305068a, Customer@1f32e575]
    //-> toString() method 有問題, 要Override 去改自己要的method


    customers.remove();//Mary
    customers.removeFirst();//John
    customers.removeLast();//Tommy
    System.out.println("Remove: "+customers);//Peter

    customers.push(new Customer("Jenny"));//same as addFirst()
    System.out.println("Push: "+customers);//[Customer(name Jenny orders= [])., Customer(name Peter orders= []).]
    customers.pop();//same as removeFirst
    System.out.println("Pop: "+customers);// [Customer(name Peter orders= []).]

    //pollFirst()
    //poolLast()

    customers.peek();
  }
}
