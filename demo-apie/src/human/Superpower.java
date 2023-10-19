package human;

public interface Superpower {
  
  void fly();
  //加返default 唔使做testing
  
  default void precogitate(){
    System.out.println("I got ");
    //主要係之後再加一個superwomen 時係唔改superman 的program 
    //下可以加個void precogitate俾superwoman 用
  }
  
}
