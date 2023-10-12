package exercise;


public class Subject {
  
  private String description; 

  private int score;//如果唔用private, 可以用.class 拎出來
  
  
  //constructor//
  public Subject (String description,int score) {
    this.description=description;
    this.score = score;
  }
  //拎出來, in object 可以用this. 去access
  public String getDescription() {
    return description;
  }
  //private int getScore() -> 拎唔到
  //同一個class 先可以拎到
  public int getScore() {
    return this.score;  
  }

  public char getGrade() {
    if (this.score >=90) {
      return 'A';
    } else if (this.score>=80){
      return 'B';
    } else {
      return 'F';
    }
  }





  public static void main(String[] args) {
    //instance method to calculate the average score of the exam
    Subject s1 = new Subject("English", 90);
    Subject s2 = new Subject("Math", 82);
    Subject s3 = new Subject("Chinese", 79);
    Exam exam = new Exam(s1);
    exam.add(s2);
    exam.delete(new Subject("Chinese", 0));
    exam.add(s3);
    double averageScore = exam.average();
    System.out.println("averageScore=" + averageScore);
    

    //private static variable
    //so, we cannot get the static variable directly
    System.out.println(Exam.getSize());
    //static method 唔可以call instance variable -> 因為無object 的概念

  }
}
