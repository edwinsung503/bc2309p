package exercise;


public class Subject {
  
  String description;

  int score;
  
  
  //constructor//
  public Subject (String description,int score) {
    this.description=description;
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }


  public static void main(String[] args) {
    //instance method to calculate the average score of the exam
    Subject s1 = new Subject("English", 90);
    Subject s2 = new Subject("Math", 82);
    Subject s3 = new Subject("Chinese", 79);
    Exam exam = new Exam(s1);
    exam.add(s2);
    exam.add(s3);
    double averageScore = exam.average();
    System.out.println("averageScore=" + averageScore);
    

    //private static variable
    //so, we cannot get the static variable directly
    System.out.println(Exam.getSize());
    //static method 唔可以call instance variable -> 因為無object 的概念

  }
}
