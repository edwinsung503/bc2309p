package transporation;


public interface Moveable {//interface (合約) -> Contract(條款及框)
  //before Java 8, 100% abstraction


  //無body
  //1.implicitly "public final static" -> 要俾Value(constant)
  String name = "Car";//public final static -> no need  要set value
  

  //interface 只要放method signature
  //2. All methods in interface are implicitly "public abstract"(by default)
  Moveable move();//method signature -> move() , by default -> public abstract < - 唔使寫
  //因為佢有run 個合約, 所以可以借身去用

  void accelerate();

  //after java 8 - 2014
  //implicitly public -> 繼承佢都會有依個method
  default void pritnWinner(String name) {
    System.out.println(name+"is Winner");
  }

  //係interface 可以寫static

  static void staticPrintWinner (String name){
    System.out.println(name+" is Winner");
  }
}
