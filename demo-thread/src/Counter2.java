import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
  
  private static int counter =0;

  private static AtomicInteger atomicCounter = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException{
    Thread t1 = new Thread(() -> {
      System.out.println("t1 is started");
      for (int i=0;i<1000000; i++){
        counter ++;
      }
      System.out.println("t1 is ended");
    });//counter ++
    t1.start();

    Thread t2 = new Thread(() -> {
      System.out.println("t2 is started");
      for (int i=0;i<1000000; i++){
        counter ++;
      }
      System.out.println("t2 is ended");
    });//counter ++

    t2.start();
    t1.join();//等2個loop 行哂先會落去main
    t2.join();
    System.out.println("Counter = "+counter);
    //有機會行左print counter 都未數完
    System.out.println("main() ends");


    Thread t3 = new Thread(() -> {
      System.out.println("t3 is started");
      for (int i=0;i<1000000; i++){
        atomicCounter.incrementAndGet();
      }
      System.out.println("t3 is ended");
    });//counter ++
    t3.start();

    Thread t4 = new Thread(() -> {
      System.out.println("t4 is started");
      for (int i=0;i<1000000; i++){
        atomicCounter.incrementAndGet();
      }
      System.out.println("t4 is ended");
    });//counter ++

    t4.start();
    t3.join();
    t4.join();

    System.out.println("atomicCoiunter = "+ atomicCounter.get());
  }
}
