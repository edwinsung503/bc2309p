public class TestSwtichExe {
  public static void main(String[]args) {
    int score = 70 ;
    char grade = ' ';

    switch (score) {
      case(90):
        grade = 'A';
        System.out.println(grade);
        break;
      case(80):
        grade = 'B';
        System.out.println(grade);
        break;
      case(70):
        grade = 'D';
        System.out.println(grade);
        break;
      default:
        grade = 'F';
        System.out.println(grade);
        break;
    }

    System.out.println("The grade is "+grade);
  
  if (score >= 80) {
    grade = 'B';
  } else if (score >= 60) {
    grade = 'D';
  } else {
    grade = 'F';
  }
  System.out.println(grade);//D
  
  
  
  
  }
  
}
