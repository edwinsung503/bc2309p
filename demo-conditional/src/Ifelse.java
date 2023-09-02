public class Ifelse {
  public static void main(String[]args) {
    int x = 100;
    if (x > 50) {
      System.out.println("x > 50");
    } 
    x = 40;
    if (x < 40) {
      System.out.println("x < 40"); // ?
    } else { // x >=40
      System.out.println("x >= 40"); //print
    }

    x = 80;
    if (x != 80) {//comme here first -> false
      System.out.println("x is not equals 80");
    } else if (x < 80) {//then come here -> false
      System.out.println("x is smaller than 80");
    } else if (x >=80) {//finally , check if x >= 80
      System.out.println("x is larger than or equal to 80");
    }
    int y = 10;
    if (y == 9) {
      System.out.println("y=9");
    } else if (y < 9){
      System.out.println("y < 9");
    } else {// y > 9
      System.out.println("y > 9");//print
    }
  }
}
