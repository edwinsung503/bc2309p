import java.util.ArrayList;

public class School {
  
  private ArrayList<Student> students;// return type : Student
  //Student [] students;
  public School (){
    this.students = new ArrayList<>();//create a arraylist object, 如果無起就會Point null 
  }

  public boolean addStudent(Student student) {
    return this.students.add(student);//-> must need a object -> arraylist
    
  }
  //getter
  public ArrayList<Student> getStudents() {
    return this.students;
  }
  @Override
  public String toString(){
    return "Student("//
      +"students"+this.students.toString()//
      +")";
  }
  public static void main(String[] args) {
    School school = new School();//school object
    //共有2個object 
    school.addStudent(new Student(15, "Mary"));
    school.addStudent(new Student(11, "John"));
    System.out.println(school.toString());//school is a object reference -> + toString

  }
}
