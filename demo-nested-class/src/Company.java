public class Company {
  //有幾多個empolyee 都唔係屬於某一個company
  private String name ;

  public static class Employee {
    private String empolyeeName;

    private int empolyeeID;

    public Employee (String empolyeeName, int empolyeeID){
      this.empolyeeName = empolyeeName;
      this.empolyeeID = empolyeeID;
    }

    public void info(){

      System.out.println("Empolyee Name: "+this.empolyeeName);
      System.out.println("Empolyee ID: "+this.empolyeeID);
    }
  }
}