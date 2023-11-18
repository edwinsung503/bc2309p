//Design a Class(Node), link up another Node object

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NameList {
  
  private String id;

  private NameList next;//-> Object reference

  public NameList (){}

  public NameList(String id){
    this.id =id;
  }

  public NameList getNext(){
    return this.next;
  }

  public void add(NameList next){
    //this.next = next;
    this.getLast().next = next;
    //自己揾最後一個 = > = 下一個
  }
  public void add(String id){
   //this.next = new NameList(id);
   //create a new object
   this.getLast().next = new NameList(id);
  }
  public NameList getLast(){
    NameList head = this;//自己(Object) 去call 揾下一個 -> this == 自己 
    while (head.getNext()!= null) {//if head.getNext() == null, exit
      head = head.getNext();
    }
    return head;
  }

  public String remove(String id) {
    //return remove element
    //if not found, return null
    //this cannot be replace
    //Special case handling
    if (this.id.equals(id)) {//eg. node1
      this.id = this.next.id;//node2 id -> node1 id
      //this.next(下一個) 的ID 
      this.next = this.next.next; //node2 勾住 node3
      return id;
    }
    NameList head = this; 
    while (head.next!=null){
      //有id, 就check id
      //2nd,3rd node checking
      if (head.next.id.equals(id)){
        //替換位置
        head.next = head.next.next;//this.next = (this.next) .next (-> 下一個)
        return id;
      } 
      head = head.next;
    }
    return null;
    //node 1 -> node 2 -> node 3
    //node 1 -> node 3
    //node1.next = node3
    //node1.getNext() => node3

  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(this.id);
    NameList head = this;
    while (head.next != null) {
      sb.append(" -> ").append(head.next.id);
      head = head.getNext();
    }
    return sb.toString();
  }

  public int size() {
    int count = 1;
    NameList head = this;
    while(head.next!=null){
      head = head.next;
      count ++;
    }
    return count;
  }

  public static void main(String[] args) {
    NameList node1 = new NameList("John");// node1 -> node2
    System.out.println("Node1 ref= "+node1);
    NameList node2 = new NameList("Mary");
    
    node1.add(node2);//1個object reference 貼住1個object reference
    System.out.println("Node2 ref= "+node2);

    NameList node3 = new NameList("Peter");
    node2.add(node3);
    //System.out.println("Node3 ref= "+node3);
    //System.out.println("Node3 ref= "+node3.id);

    //node 1 -> node 2-> node 3
    //揾到node 2 先揾到node 3
    //node 3 無next -> 因為佢最後
    NameList head = node1;//可以操作個head 依個Object reference 但唔會改node1
    //node3 = null
    while (head.getNext() !=null){//if head.getNext() == null, exit
      head = head.getNext();
    }

    System.out.println("List tail = "+head);
    System.out.println("List tail id = "+head.id);
    //-> 成功SAVE 左一個array 的樣  -> LinkedList

    // Custom List of String, implemented by LinkedList mechanism
    NameList nl = new NameList("IJK");
    nl.add("ABC");
    nl.add("DEF");
    nl.add("XYZ");
    System.out.println("size=" + nl.size()); // 4

    // Before Removing
    System.out.println(nl.toString());
    // After Removing
    nl.remove("DEF");
    System.out.println(nl.toString());
    // After Removing
    nl.remove("XYZ");
    System.out.println(nl.toString());
    // After Removing
    nl.remove("IJK");
    System.out.println(nl.toString());

    // Compare to LinkedList
    LinkedList<String> nl2 = new LinkedList<>();
    nl2.add("ABC");
    nl2.add("DEF");
    nl2.add("XYZ");
    System.out.println("addAll= "+nl2);
    nl2.remove("XYZ");
    System.out.println("remove XYZ= "+nl2);
    nl2.get(nl2.size()-1);// no arrayin nl2

    ArrayList<String> nl3 = new ArrayList<>(); //
    nl3.add("ABC");
    nl3.add("DEF");
    nl3.add("GHI");
    nl3.get(nl3.size()-1);//arr[arr.length-1]
    //如果係要揾最後個位置就用ArrayList, 因為即刻揾到

    List<String> nl4 = new ArrayList<>();
    nl4 = new LinkedList<>();
    //Compile time in Java: List<String> (Type) determine which methods can be invoked
    //Run time in Java: nl4 will know which object it points to.
    //ArrayList or LinkedList Ojbect??
    
    //最後行先知行左linkedList 的.add() 所以runtime 時係行linkedlist
    nl4.add("ABC");
    nl4.remove(0);
    System.out.println(nl4.size());

  }

}
