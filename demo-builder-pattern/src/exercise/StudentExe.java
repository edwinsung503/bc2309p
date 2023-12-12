package exercise;

public class StudentExe {
  
  private String name;
  private int age;
  private char gender;

  public StudentExe (String name, int age, char gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public static StudentExe.Builder builder (){
    return new StudentExe.Builder();
  }
  public static class Builder {
      private String name;
      private int age;
      private char gender;

      public Builder name(String name) {
        this.name = name ;
        return this;
      }
      public Builder age (int age){
        this.age = age;
        return this;
      }

      public Builder gender (char gender) {
        this.gender = gender;
        return this;
      }

      public StudentExe build(){
        return new StudentExe(this.name, this.age, this.gender);
      }

      public static void main(String[] args) {
        StudentExe studentExe = StudentExe.builder().name("John").age(18).gender('M').build();
      }
  }

}
