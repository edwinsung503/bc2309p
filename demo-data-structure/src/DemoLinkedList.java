import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("hello");
    strings.add("world");
    System.out.println(strings.contains("world"));

    List<String> strings1 = DemoLinkedList.getEmptyList(0);//return interface, 只可以用Parent(List) 去接
    strings1.add("hello");
    strings1.add("world");
    System.out.println(strings1.contains("world"));

  }

  public static List<String> getEmptyList(int value) {
    if (value ==0) {
      return new ArrayList<>();
    } else {
      return new LinkedList<>();
    }
    //ArrayList 同LinkedList 都係implement List 
  }
}
