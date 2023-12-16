public class Task implements Runnable{
  
    @Override
    public void run() {
      int sum =0;
      for (int i=0; i< 1000; i++){
        sum =1;
        try{
          Thread.sleep(1000);
        } catch (InterruptedException e){

        }
      }
      System.out.println("Task 1 is completed");
    }

  public static void main(String[] args) throws Exception {
    //3支thread -> main 係其中1個thread
    Task task = new Task();
    //task.run();

    Task2 task2 = new Task2();
    //task2.run();

    //System.out.println("Task is completed");
    
    Thread t1 = new Thread(task);
    t1.start();//non-blocking

    //System.out.println("T1 is completed");

    Thread t2 = new Thread(task2);
    t2.start();//create another thread

    System.out.println("main() ends");
    
  }
}
