import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {

  public static ArrayList<String> al = new ArrayList<>();
  public static Vector<String> vs =new Vector<> ();
  //Vector 可solve 

  //ArrayList 多線程有好多問題  read / write 時間affect
  
  public static void main(String[] args) throws InterruptedException {


    Thread t1 = new Thread(()->{
      for (int i =0; i<10000;i++){
        al.add("s");
      }
    });

    Thread t2 = new Thread(()->{
      for (int i =0; i<10000;i++){
        al.add("s");
      }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(al.size());
    //Solution by vector
    Thread t3 = new Thread(()->{
      for (int i =0; i<10000;i++){
        vs.add("s");
      }
    });

    Thread t4 = new Thread(()->{
      for (int i =0; i<10000;i++){
        vs.add("s");
      }
    });

    t3.start();
    t4.start();

    t3.join();
    t4.join();

    System.out.println(vs.size());

    //Vector class implemnt List-> 唔要性能-> 多線程系統
    List<String> strings = new Vector<>();//thread-safe
    strings.add("abc");
    strings.add("def");
    strings.remove("abc");
    System.out.println(strings.get(0));//def
    strings.remove(0);
    System.out.println(strings.size());//0

    Vector<String> ss = new Vector<>();
    ss.add("abd");
    ss.add("def");
    ss.removeElementAt(1);
    System.out.println(ss);

    List<String> ss2 = ss;
    //ss2.removeElementAt(1);
  
  }
}
