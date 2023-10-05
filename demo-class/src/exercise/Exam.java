package exercise;

//Summary (05Oct)
//-Static variable
//-default empty constructor
//-static method can call static variable
//- instance method can call static variable
// - can static method call insatance variable ?? why?? 因為無object idea , 唔可以this
// - instance medthod can call instance variable (getter , setter)
// - what is meaning of "no setter"? - > 
//- what is private?

public class Exam {
  //three subject

  Subject [] subjects;
  private static int size = 0 ; // 唔可以出面.size

  //static final String x = "hello";// complie time 已經要付上一個值  (以後唔想有人改寫佢), 唔可以再改寫的資料
  static final int noOfdayOfweek = 7;//唔可以重新assign 新value 入去
  //setter
  //getter
  
  //constructor
  public Exam (Subject subject) {
    this.subjects = new Subject[100];
    this.subjects[0] = subject;
    size++;// contructor can change the static variable

  }
  // instance method 
  public void add(Subject subject) {
    double sum = 0;
    for (int i =0; i < this.subjects.length; i++) {
      if (this.subjects[i] !=null) {
        this.subjects[i] = subject;
        size++ ; // instance metehod can change the static variable
      }
    }
  }
  //average
  

  public static int getSize() {
    return size;
  } 
}

///用static variable to replace the function of size()


