import java.util.Scanner;

public class ScannerExe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    //System.out.println("Enter an integer");
    //int num = scanner.nextInt();//next integer
    //System.out.println("You entered: "+num);
    //System.out.println("Enter an double");
    //double num1 = scanner.nextDouble();
    //System.out.println("You entered: "+num1);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Enter your favourite color: ");
    String color = scanner.nextLine();
    System.out.println("You entered: "+name);
    System.out.println("You entered favourite color: "+color);

    scanner.close();
  }
}
