public class TestSwtich {
  public static void main(String[]args) {
    int score = 90;
    char grade = ' ';
    switch (score) {// check if score match anyone of the following cases
      case 90:
        grade = 'A';
        System.out.println("case 90");
        break;
      case 80:
        grade = 'B';
        System.out.println("case 80");
        break;
      case 70:
        grade = 'C';
        System.out.println("case 70");
        break;
      case 60:
        grade = 'D';
        System.out.println("case 60");
        break;
      default:
        grade = 'F';
        break;
    }
    // print 'A'
    System.out.println("The grade is "+grade);// string merge

    //Alternative , if -elase
    if (score >= 90) {
      grade ='A';
    } else if (score >= 80) {
      grade ='B';
    } else if (score >= 70) {
      grade ='C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade ='F';
    }
    System.out.println("Grade is "+ grade);
    
    

  }
}
//無and or , 又係指定幾個item 的野