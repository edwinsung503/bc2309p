package transporation;


public interface Moveable {//interface (合約) -> Contract(條款及框)
  //無body
  //implicitly "public final static" -> 要俾Value
  //String name = "Car";//public final static -> no need  要set value

  //interface 只要放method signature
  //all methods in interface are implicitly "public abstract"(by default)
  Moveable move();//method signature -> move() , by default -> public abstract < - 唔使寫
  //因為佢有run 個合約, 所以可以借身去用

  void accelerate();

  //after java 8 
  //implicitly public -> 繼承佢都會有依個method
  //default void pritnWinner(String name) {
    //System.out.println(name+"is Winner");
  //}

  //係interface 可以寫static

  static void staticPrintWinner (){
    System.out.println(name+" is Winner");
  }
}
