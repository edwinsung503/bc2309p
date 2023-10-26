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
  public boolean isNameValid(){
    return this.name.length() <= 10;
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

  public boolean isAdult(){
    return this.age >= 18;
  }
  public boolean isEderly(){
    return this.age >= 65;
  }
  public static boolean isEderly(int age) {
    return age >= 65;//任何class 都可以用static method, 唔可以指定某個class 用Student / teacher / 
  }

  @Override//Overriding the toString method in Objcet.class// Override parent class (object) toString Method
  public String toString() {//toString - 
    return "name= "+this.name //
    + "age= "+this.age;
  }

  public static void main(String[] args) {
    Persons persons = new Persons("John", 19);//true
    System.out.println(persons.isAdult());
    Persons persons1 = new Persons("Mary", 12);//false
    System.out.println(persons1.isAdult());
    

    //Approach 1
    if (persons.isAdult()){// 唔用if (persons.getAge()>=18) -> busines domain
      System.out.println("it is a adult");
    }
    Persons person3 = new Persons("abcedwjwewwdwef",20);
    System.out.println(person3.isNameValid());//false
    System.out.println(person3.isEderly());//false

    System.out.println(isEderly(person3.getAge()));//false
    
  }
  
}
