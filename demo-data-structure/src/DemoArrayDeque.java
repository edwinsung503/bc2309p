import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoArrayDeque {
  
  public static void main(String[] args) {
    int noOfCount = 1000000;
    //add 1,000,000 string into queue
    Queue<String> arrayQueue = new ArrayDeque<>();
    for(int i=0; i< noOfCount; i++) {
      arrayQueue.add("Test");
    }
    long start = System.nanoTime();
    //System.out.println(start);
    //poll
    while( !arrayQueue.isEmpty()) {
      arrayQueue.poll();
    }
    long end = System.nanoTime();
    System.out.println("Exceution Time for Queue: "+ (end-start));

    Queue<String> linkedQueue = new LinkedList<>();
    for(int i=0; i< noOfCount; i++) {
      linkedQueue.add("Test");
    }
    start = System.nanoTime();
    //System.out.println(start);
    //poll
    while( !linkedQueue.isEmpty()) {
      linkedQueue.poll();
    }
    end = System.nanoTime();
    System.out.println("Exceution Time for LinkedList: "+ (end-start));
    
    //Deque / Queue / ArrayQueue

    
    //Queue Type -> DeQue
    Deque<String> deque2 = (Deque) arrayQueue ;
    //runtime 先知 compiler 係咪可以放 arrayQueue Deque 型態(runtime 時才決定 risk of type safetly)
    //queue -> 放入deque 的型態要confirm arrayQueue 係有齊queue 同deque 的method

    //1.No new Object
    //2.Two object reference (Deque & Queue) pointing to the same object (new ArrayDeque)
    //3.During Run-Time, JVM will check if the object fulfill the object referencce's type (Method 的數量)
    //Potentially, run-time error
    
    //Type Safety Checking, that's why there is no type-safety complain anymore
    //現在放返出來  
    if (arrayQueue instanceof Deque<?>) {
      deque2 = (Deque<String>) arrayQueue;
    }

    Deque<Integer> dequeIntegers = new LinkedList<>();
    Queue<Integer> queueIntegers = dequeIntegers;
    //deque 型態的object 有哂queue 型態的method , 所以ok
    //Because Deque (dequeIntegers) is a child of Queue, compiler ensure can hold the object 

    //Deque<String> deque = new ArrayDeque<>();
    //左手決定有什麼method 可以用
    //右手決定性能-> SPEED 

  }
}
