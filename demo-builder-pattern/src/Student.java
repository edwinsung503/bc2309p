public class Student {
  
  private String name;

  private int age;

  private char gender ;
  //Constructor
  private Student (String name, int age, char gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public static Student.Builder builder (){
    return new Student.Builder();
  }//-> 唔使再new Student

  public static class Builder{
    private String name;

    private int age;

    private char gender ;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder gender(char gender) {
      this.gender = gender;
      return this;
    }

    public Student build (){
      return new Student(this.name, this.age, this.gender);
    }
  }

  public static void main(String[] args) {
    //Student student = new Student.Builder()//
    Student student = Student.builder()//-> row 15's Student.Builder'smethod
          .name("John")//
          .age(12)//
          .gender('M')//
          .build();
  }
}
