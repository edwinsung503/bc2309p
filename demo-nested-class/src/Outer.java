public class Outer {
  
  private String name1;

  private static int value = -20;//Outer.value

  public Outer (String name){
    this.name1 = name;
  }
  public void disply (){
    System.out.println("outer name1= "+ this.name1);
  }

  public class InnerClass {

    private String name3 ;

    public InnerClass (String name3){
      this .name3 = name3;
    }

    public void disply (){
      System.out.println("Outer name1= "+ name1+ ", Inner name3 = "+ this.name3);
    }//xx this.name1 -> 因為係出面的object -> 唔可以用this.name1 -> 2隻唔同object, 要有出面的object 才可以new 新object
    //LCK libaray vs SCP libaray 書
  }
  public static class NestedClass {//Outer.NestedClass

    private String name2 ;

    public NestedClass (String name) {
      this.name2 = name;
    }

    public void display() {
      //System.out.println(this.name2 + " "+ this.name1);
      //Outer class and static nested class not talk to each other
      System.out.println(this.name2+" "+ Outer.value);//static variable 可以call
    }

  }
}
