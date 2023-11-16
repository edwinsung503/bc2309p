import java.util.LinkedList;

public class NameListExe {
  
  private String ids;

  private NameListExe next;

  public NameListExe (String ids){
    this.ids = ids;
  }

  public NameListExe() {}

  public NameListExe getNext(){
    return this.next;
  }

  public NameListExe getLast(){
    NameListExe head = this;
    while (head.getNext() !=null) {
      head = head.getNext();
    }
    return head;
  }

  public void add(String ids) {
    this.getLast().next = new NameListExe(ids);
  }

  public void add(NameListExe next){
    this.getLast().next = next;
  }

  public int size () {
    NameListExe head = this;
    int count = 1;
    while (head.getNext() !=null){
      head = head.getNext();
      count ++;
    }
    return count ;
  }

  public String remove(String ids){
    if (this.ids == ids){
      this.ids = this.next.ids;//String
      this.next = this.next.next;//ram location
      return ids;
    }
    NameListExe head = this;
    while (head.getNext() != null){
      if (head.getNext().ids.equals(ids))  {
        head.next = head.next.next;
        return ids;
      }
      head = head.getNext();
    }
    return null;
  }


  public static void main(String[] args) {
    NameListExe nl1 = new NameListExe("Mary");
    NameListExe nl2 = new NameListExe("John");
    System.out.println("nl1 ref= "+nl1);
    nl1.add(nl2);
    System.out.println("nl2 ref= "+nl2);
    NameListExe nl3 = new NameListExe("Peter");
    nl2.add(nl3);
    System.out.println("nl3 ref= "+nl3);
    System.out.println("nl3 ref= "+nl3.ids);

    NameListExe head = nl1;
    while (head.getNext() !=null){
      head = head.getNext();
    }
    System.out.println("tail= "+head);
    System.out.println("tail ids= "+head.ids);
    
  }



}
