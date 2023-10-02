import java.util.Random;

public class RandomExe {
  public static void main(String[] args) {
    Random random = new Random();

    int randomNumber = random.nextInt(12);
    double randomNumber1 = random.nextDouble();
    System.out.println("Random Number: "+randomNumber);
    System.out.println("Random Number: "+randomNumber1);//0(inclusive)-1
    randomNumber += 10 ;
    System.out.println("Random Number: "+randomNumber);

  }   
}
