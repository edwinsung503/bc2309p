public class Company {
  //有幾多個empolyee 都唔係屬於某一個company
  //Class company 可以有好多 employee
  private String name ;

  public static Employee creatEmployee (String empolyeeName, int empolyeeID){
    return new Employee(empolyeeName, empolyeeID);
  }

  public static class Employee {
    private String empolyeeName;

    private int empolyeeID;
    //constructor
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
