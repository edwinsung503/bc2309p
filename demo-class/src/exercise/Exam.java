package exercise;

//Summary (05Oct)
//-Static variable
//-default empty constructor
//-static method can call static variable
//- instance method can call static variable
// - can static method call insatance variable ?? why?? 因為無object idea , 唔可以this
// - instance medthod can call instance variable (getter , setter)
// - what is meaning of "no setter"? - > 後期唔可以改parameter
//- what is private? 唔可以係出面用.class method 去call

public class Exam {
  //Access Modifier: private, public, protected, package-private (default)
  //public -> class, attribute, method , constructor
  //private - > attribute, method , constructor
  //producted -> attribuet, method, constructor
  //package-private -> class, attribute, method, constructor
  private Subject [] subjects;
  private static int size = 0 ; // 唔可以出面.size

  //static final String x = "hello";// complie time 已經要付上一個值  (以後唔想有人改寫佢), 唔可以再改寫的資料
  private static final int noOfdayOfweek = 7;//唔可以重新assign 新value 入去
  //Camel Case

  //setter
  //getter
  
  //constructor
  public Exam (Subject subject) {
    this.subjects = new Subject[100];
    this.subjects[0] = subject;
    size++;// contructor can change the static variable

  }

  public static int getNoOfDayOfAWeek (){
    return noOfdayOfweek;//跟class 的一舊野 
  }
  //remove a subject
  public boolean delete(Subject subject) {
    for (int i=0; i<this.subjects.length;i++){
      if (this.subjects[i] !=null //
      && subjects !=null //
      && this.subjects[i].getDescription().equals(subject.getDescription())) {
        this.subjects[i] = null;
        size --;// delete a size from subject
        return true;
      }
    }
    return false;
  }
  // instance method 
  public void add(Subject subject) {
    for (int i =0; i < this.subjects.length; i++) {
      if (this.subjects[i] !=null) {
        this.subjects[i] = subject;
        size++ ; // instance metehod can change the static variable
      }
    }
    System.out.println("end of add()");
  }

  public int size() {
    int count = 0;
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] != null)
        count++;
    }
    return count;
  }

  public double average() {
    double sum = 0;
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] != null)
        sum += this.subjects[i].getScore();
    }
    return sum / this.size(); // int / int -> int, double / int -> double
  }

  public static int getSize() {
    return size;
  }
  public static void main(String[] args) {
    Subject subject = new Subject("ABC",89);
    System.out.println(subject.getGrade()); 
    System.out.println("Static method, Exam.getNoOfDayOfAWeek()="+Exam.getNoOfDayOfAWeek());;
  }
}

///用static variable to replace the function of size()


