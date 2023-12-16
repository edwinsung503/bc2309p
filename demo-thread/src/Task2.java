public class Task2 implements Runnable{

    @Override
    public void run() {
      int sum =0;
      for (int i=0; i< 1; i++){
        try{
          Thread.sleep(500);//0.5s
        } catch (InterruptedException e){

        }
      }
      System.out.println("Task 2 is completed");
    }
}
