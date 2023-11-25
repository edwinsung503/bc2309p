import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ{
  
  public static void main(String[] args) {
    
    Queue<Integer> pq = new PriorityQueue<>(new SortByIntegerDesc());

    pq.add(40);
    pq.add(20);
    pq.add(15);
    pq.add(150);

    while (!pq.isEmpty()){
      System.out.println(pq.poll());
    }
    //15,20,40,150
    //每次加一個都會排一次-> 每次都插隊
    //唔同於最後先排次序
    Queue<String> pq2 = new PriorityQueue<>(new SortByStringDesc());
    pq2.add("Edwin");
    pq2.add("John");
    pq2.add("Apple");

    while(!pq2.isEmpty()){
      System.out.println(pq2.poll());
    }
    
    //老人家要排先=隊優先
    //> 再用名排
    Queue<Integer> pq3 = new PriorityQueue<>(new PersonSortByAgeAsc());
    pq3.add(3);
    pq3.add(434);
    pq3.add(65);
  }
}