public class Persons {//parent class

  private String name;

  private int age ;

  public static int s;

  public static String x ="hello";


  public static int getY() {//static method
    return 10;
  }

  //考慮可以擴展
  //All agruement constructor
  public Persons(String name, int age) {//constructor
    this.name = name;
    this.age =age;
  }

  //empty constructor
  public Persons () {}

  public void setName(String name){//setter
    this.name = name ;
  }

  public String getName(){//getter
    return this.name;
  }

  public void setAge(int age) {//setter
    this.age = age;
  }

  public int getAge() {//getter
    return this.age;
  }
  @Override//Overriding the toString method in Objcet.class// Override parent class (object) toString Method
  public String toString() {//toString - 
    return "name= "+this.name //
    + "age= "+this.age;
  }
  
}
