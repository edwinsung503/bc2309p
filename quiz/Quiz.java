public class Quiz {
  public static void main(String[] args) {
    //Quiz 1
    int price = 150;
    int quantity =10;
    double discount = 0.9;// double 

    System.out.println(price * quantity * discount);
  //Quiz 5
    String str ="";
    for (byte i = 127; i< 128; i++) {
      str+=i;//127 
      if (i<0) {
        break;
      }
    }
    System.out.println(str);


    //Quiz 8
    String [] strings= new String [4];//<- 0,1,2
    String sum = ""; 

    for (int i=0;i < 4;i++) {// 0,1,2,3 run four times
      strings[i] = String.valueOf(i);
      sum+= strings[i];
      //System.out.println(sum);
    }
    System.out.println(sum);
    
    //Quiz 9
    int a =0;
    while (a<3) {//0 -> 1->2
      switch (a) {
        case 0:
          System.out.println("0");
        case 1:
          System.out.println("1");
      } 
      a++;
    }

    int numericaGrade =90;
    char letterGrade =' '; 
    switch (numericaGrade) {
      case 90:{
        letterGrade ='A';
        System.out.println(letterGrade);
      }
      case 100:{
        letterGrade ='B';
        System.out.println(letterGrade);
      }
    }
    
  }
}
