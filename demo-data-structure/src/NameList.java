//Design a Class(Node), link up another Node object

import java.util.LinkedList;
//import javax.print.attribute.standard.MediaSize.NA;

public class NameList {
  
  private String id;

  private NameList next;//-> Object reference

  public NameList(String id){
    this.id =id;
  }

  public NameList (){}

   public NameList getNext(){
    return this.next;
  }

  public NameList getLast(){
    NameList head = this;//自己(Object) 去call 揾下一個 -> this == 自己 
    while (head.getNext()!= null) {//if head.getNext() == null, exit
      head = head.getNext();
    }
    return head;
  }

  public NameList getMiddle(){
    //TodoList
    //Step 1 count total num of elements / 2
    int count =0;
    NameList num = this;
    
    //Step 2 loop until the half count
    return null;
  }

  public void add(NameList next){
    //this.next = next;
    this.getLast().next = next;
    //自己揾最後一個 = > = 下一個
  }
  public void add(String id){
   //this.next = new NameList(id);
   this.getLast().next = new NameList(id);
  }

  public String remove(String id) {
    //return remove element
    //if not found, return null
    //this cannot be replace
    //Special case handling
    if (this.id == id) {//eg. node1
      this.id = this.next.id;//node2 id -> node1 id
      //this.next(下一個) 的ID 
      this.next = this.next.next; //node2 勾住 node3
      return id;
    }
    NameList head = this;
    while (head.getNext()!=null){
      //有id, 就check id
      if (head.getNext().id.equals(id)){
        //替換位置
        head.next = head.next.next;
        return id;
      } 
      head = head.getNext();
    }
    return null;
    //node 1 -> node 2 -> node 3
    //node 1 -> node 3
    //node1.next = node3
    //node1.getNext() => node3

    //while (this.id == id){
      //System.out.println(this.id);
    //}
  }

  public int size() {
    int count = 1;
    NameList head = this;
    while(head.getNext()!=null){
      head = head.getNext();
      count ++;
    }
    return count;
  }

  public static void main(String[] args) {
    NameList node1 = new NameList("John");// node1 -> node2
    NameList node2 = new NameList("Mary");
    System.out.println("Node1 ref= "+node1);
    node1.add(node2);//1個object reference 貼住1個object reference
    System.out.println("Node2 ref= "+node2);

    NameList node3 = new NameList("Peter");
    node2.add(node3);
    System.out.println("Node3 ref= "+node3);
    System.out.println("Node3 ref= "+node3.id);

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


    NameList nl = new NameList();
    nl.add("ABC");
    nl.add("DEF");
    nl.add("XYZ");

    LinkedList<String> nl2 = new LinkedList<>();
    nl2.add("ABC");
    nl2.add("DEF");
    nl2.add("XYZ");
    System.out.println("addAll= "+nl2);
    nl2.remove("XYZ");
    System.out.println("remove XYZ= "+nl2);

  }

}
