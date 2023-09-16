public class demostaticmethodExe {
  public static void main(String[]args) {
    int total = twosum(2, 3);
    System.out.println(total);

    int subtotal = muli(10,12);
    System.out.print(subtotal);
  }

  public static int twosum(int a, int b) {
    int total = a * b;  
    return total;
  }

  //min : 2, max :6- > mulitpcaiton
  public static int muli(int min, int max) {
    int subtotal = 0;
    for (int i = min; i <= max; i++) {
      subtotal += i;
    }
    return subtotal;
  }

}
