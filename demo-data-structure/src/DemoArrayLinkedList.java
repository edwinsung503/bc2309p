import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayLinkedList {

  public static void main(String[] args) {
    //ArrayList add 10,000
    //long start = System.nanoTime();
    //long start1 = System.currentTimeMillis();
    //System.out.println(start);//1700293029920
    int count = 1000000;
    List<String> arrayList = new ArrayList<>();
    for (int i=0; i< count; i++){
      arrayList.add("Test");
    }
    long start = System.nanoTime();
    //System.out.println(start);

    for (int i=0; i< count; i++) {
      arrayList.remove(0);
    }

    long end =System.nanoTime();
    System.out.println("Execution Time for ArrayList: "+ (end -start));//
    
    //LinkedList add 10,000
    List<String> linkedList = new LinkedList<>();
    for (int i=0; i< count; i++) {
      linkedList.add("Test");
    }
    start = System.nanoTime();
    for (int i=0; i< count; i++) {
      linkedList.remove(0);
    }

    end = System.nanoTime();
    System.out.println("Execution Time for LinkedList: "+(end - start));
  }
  
}
