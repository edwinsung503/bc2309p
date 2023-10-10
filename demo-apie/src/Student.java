public class Student extends Persons {// student > child class
  
  //extends = 繼承 > 並没有繼承Constructor
  private String studentID;//唔放係person 到因為teacher 唔會有

  //All-args constructor
  public Student (String studentID) {
    //一定要call super() 要記係有call 到  
    super();//calling parent class constructor v-> 唔使自己寫,本身就已Call 左, 可以唔寫
    this.studentID = studentID;
  }

  public Student (String name, int age, String studentID) {
    //student 重來無name 同age 的attribute
    super(name,age);//因為student 無繼承Persons 的constructor 同attribute,要用super 去call 返name + age
    this.studentID = studentID;
  }

  public void setStudenID(String studentID) {
    this.studentID = studentID;
  }

  public String getStudentID() {
    return this.studentID;
  }
  public Student () {}
  public static void main(String[] args) {
    Student student = new Student();// add empty constructor
    student.setAge(20);
    student.setName("John");

    Persons person = new Persons();
    person.setAge(23);
    person.setName("Mary");
    

    Student student2 = new Student("John2", 22, "1234");
    System.out.println(student2.getAge());
    System.out.println(student2.getName());
    System.out.println(student2.getStudentID());

    System.out.println("Student"+student.getAge());//20
    System.out.println("Person"+person.getName());//Mary

    System.out.println(Persons.x);//跟class (Student) < 應該用以個因為係Person (class) call
    System.out.println(Student.x);//hello
    System.out.println(student2.x);//唔正確的方法 - > 用object 拎class 的野
    //student 有無繼承X 的variable << 

    System.out.println(Persons.getY());//10 best way to call
    System.out.println(Student.getY());//10
    System.out.println(person.getY());//10 唔好用
    System.out.println(student2.getY());//10 唔好用
    
    System.out.println(Student.s);// 0 <- int default value

  }

}
