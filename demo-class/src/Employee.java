public class Employee {
  private String name;

  private static String x;

  static{//static block -> how it work in 
    System.out.println("Step3");
    x = "john";
  }

  {//initialization block (主要放係main 做, 較少人用, 主要用constructor)
    System.out.println("Step 1: this is initialization block when you new a object");//step1
    name = "abc";
  }

  public Employee(String name) {
    System.out.println("Step 2: this is a constructor");//step2
    this.name= name;
  }

  public String getName() {
    return this.name;
  }
  public static void main(String[] args) {
    System.out.println("Start");
    Employee employee = new Employee("John");
    System.out.println("End");
    System.out.println(Employee.static(name));
  }
}
