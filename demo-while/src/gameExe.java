import java.util.Scanner;
import java.util.Random;

public class gameExe {
  public static void main(String[]args){
    //range 1 - 100
    //bomb: 74 (random num)
    //User guess a number between 1 -100
    //70
    //User guess a number between 71 -100
    //80
    //User guess a number between 71 -79
    //...
    //74 - > bomb
    
    //which type of loop - > 
    //Bomb (random)
    //How to ask user question?
    //compare user input vs bomb
    //revise the range for user to pick again
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) +1 ;
    int input = -1;
    do {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number between: " +min+" to " +max);
    input = scanner.nextInt();
    if (input < min || input >max ) {
      System.out.println("Wrong number. Please input again");
      continue;
    }
    if (input < bomb) {
      min = input + 1 ;
    } else if (input > bomb ) {
      max = input - 1;
    }
    } while (input !=bomb) ;
    System.out.println("Congras");
  }
}
