import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
    //If LinkedList(Class) has 100 methods ->child
    //if Queue(Interface) has 60 methods -> father
    //if List(Interface) has 40 methods -> mother
    Queue<String> strings = new LinkedList<>();
    strings.add("ABC");
    strings.add("GHI");
    strings.add("DEF");
    System.out.println(strings);
    String polledString = strings.poll();
    System.out.println(polledString);
    //System.out.println(strings);

    System.out.println(strings.isEmpty());//false
    int count = 3;//IJKIJKIJK, DEFDEFDEF
    String str = "";
    System.out.println("peek= "+strings.peek());
    //just look up the value of the head of the queue

    String head = strings.peek();//"GHI"
    int size = strings.size();//2
    int queueCount = 0;

    while (!strings.isEmpty()){
      //if (--count <=0) {
       // break;
      //}
      str = strings.poll();
      strings.add(str.concat(str));//GHIGHI / DEFDEF
      //System.out.println("The 1st= "+strings);
      //The 1st= [DEF, GHIGHI]
      //The 2nd= [GHIGHI, DEFDEF]
      //The 3rd= [DEFDEF, GHIGHIGHIGHI]      
      //The 4th= [GHIGHIGHIGHI, DEFDEFDEFDEF]
      if (++queueCount >= size *2) {
        break;
      }
      
    }
    //how to set to [GHIGHIGHIGHI, DEFDEFDEFDEF]
    System.out.println(strings);
    //System.out.println(strings.isEmpty());//true
    System.out.println(strings.size());//0

    strings.addAll(List.of("XYZ","MNO"));
    System.out.println(strings);

    //List.of
    List<String> strs = List.of("A","B");//唔可以操作.add-> 但可以好快可以加哂
    //但唔可以用.add method
    //strs.add("C");
    //System.out.println(strs);

    //Queue -> 用while 但好少用for-each
    System.out.println(strings.contains("MNO"));//true
    for (String s : strings) {
      System.out.println(s);
    }
    strings.remove();//poll()
    System.out.println(strings);
    strings.remove("MNO");
    System.out.println(strings);

    //可以print String -> 要有toString<< , Linkedlist 有toString 的method 先可以print String出來

    //List -> 有次序
    //Queue-> 有次序, 但唔可以用arraylist 拎出來
    //interface canonly extend


    //Compile time : obj-ref strings can only call 60 methods in Queue
    //因為只可以用Queue<String>的method 
    //error: strings.indexOf() -> this is method from LinkedList, but not Queue Interface
    List<String> strings2 = new LinkedList<>();
    //Why 約化LinkedList的功能??
    //LinkedList 係有哂Queue 同List 的method



  }
}
