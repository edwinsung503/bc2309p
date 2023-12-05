public class DemoIllegalAgument {
  
  private int balance;
  //Constructor
  public DemoIllegalAgument(int balance){
    this.balance = balance;
  }
  public static void main(String[] args) {
    DemoIllegalAgument account = new DemoIllegalAgument(1000);
    account.credit(-100);
    // java.lang.IllegalArgumentException
  }

  public void credit (int amount ){
    if (amount <= 0){
      throw new IllegalArgumentException();
    }
    this.balance += amount;
  }
}
