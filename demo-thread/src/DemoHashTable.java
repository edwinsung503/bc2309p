import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashTable {


  public static void main(String[] args) throws InterruptedException {
    //Hashmap(non Thread-safe)
    //HashTable(Thread-safe)

    HashMap<Integer, String> map = new HashMap<>();
    Hashtable<Integer, String> table = new Hashtable<>();

    Runnable mapPut = () -> {
      for (int i=0;i<100; i++){
        map.put(i,String.valueOf(i));
      }
    };

    Thread t1 = new Thread(mapPut);
    t1.start();
    Thread t2 = new Thread(mapPut);
    t2.start();

    t1.join();
    t2.join();

    System.out.println(map.size());
    for (var entry: map.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }

    Runnable tablePut = () -> {
      for (int i=0;i<100; i++){
        table.put(i,String.valueOf(i));
      }
    };

    Thread t3 = new Thread(tablePut);
    t3.start();
    Thread t4 = new Thread(tablePut);
    t4.start();

    t3.join();
    t4.join();

    System.out.println(table.size());
    for (var entry: table.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
  }
}
