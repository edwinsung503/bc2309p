public class Employee {
  private String name;

  private static String x= genX();

  public static final int HOURS_PER_DAY = 24;//constance ->HOURS_PER_DAY 因為常量

  public static final double PI = Math.PI;//constance >PI

  static{//static block -> how it work in - > 行依個, static block -> run static class// 就算無private static String x= genX();都會照行static block
    System.out.println("Step2: Start Block");
    
  }
  public static String genX(){
    System.out.println("Step1: Start genX()");
    return "1234";
  }
  {//initialization block (主要放係main 做, 較少人用, 主要用constructor)
    System.out.println("Step 3: this is initialization block when you new a object");//step1
    name = "abc";
  }

  public Employee(String name) {
    System.out.println("Step 4: this is a constructor");//step2
    this.name= name;
  }

  public String getName() {
    return this.name;
  }
  public static void main(String[] args) {
    System.out.println("Start");
    Employee employee = new Employee("John");
    System.out.println("End");
  }
}
