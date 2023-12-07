@FunctionalInterface//
public interface Flyable {//FunctionalInterface
  void fly();
  //void read();
  //1份合約1個功能->FunctionalInterface
  public static void main(String[] args) {
    //Case 1
    Flyable f = new Superman();
    //Case 2 - > one off
    //Chapter 27 - Anonymous Inner Class
    Flyable f2 = new Flyable() {
      @Override
      public void fly(){
        System.out.println("I'm flying 2...");
      }
    };
    //Lambda-> functional interface -> 只可講一個method內容
    //Case 3  "() -> " 
    Flyable f3 = () -> {
      System.out.println("I'm flying 3...");
    };
    Readable f4 = () -> {
      System.out.println("I'm reading 3...");
    };
  }
}

