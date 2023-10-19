package Olympic;
//interface
public interface Running {

  String name = "Johnson";

  Running run();

  void accelerate();
  
  default void print(String name){
    System.out.println(name +" is a Winner");
  }

  static void staticPrintWinner (String name){
    System.out.println(name+" is Winner");
  }

}
