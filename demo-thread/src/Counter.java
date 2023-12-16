public class Counter {

  public static int counter = 0;//class variable

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      counter ++;
    });//counter ++
    t1.start();

    Thread t2 = new Thread(() -> {
      counter ++;
    });//counter ++

    t2.start();

    System.out.println("Counter = "+counter);
    //有機會行左print counter 都未數完
    System.out.println("main() ends");
  }


  
}
