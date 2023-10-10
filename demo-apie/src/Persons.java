public class Persons {//parent class

  private String name;

  private int age ;

  public static int s;

  public static String x ="hello";


  public static int getY() {
    return 10;
  }

  //考慮可以擴展
  //All agruement constructor
  public Persons(String name, int age) {
    this.name = name;
    this.age =age;
  }

  //empty constructor
  public Persons () {}

  public void setName(String name){
    this.name = name ;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String toString() {
    return "name= "+this.name //
    + "age= "+this.age;
  }
  
}
