package Olympic;

public class Arena {
  
  private int x ;

  public Arena() {
    this.x = 1;
  }
  
  public boolean isArrived(){
    return x >=100;
  }

  public void setX (int x){
    this.x = x;
  }
  
  public int getX(){
    return this.x;
  }



  public static void main(String[] args) {
    Mary mary = new Mary(10);
    Peter peter = new Peter(14);

    while(!mary.isWinners() && !peter.isWinners()){
      mary.run();
      if (mary.run().isWinners()){
        //System.out.println("Mary Wins");
        //mary.print("mary");
        Running.staticPrintWinner("Mary");
        break;
      }
      peter.run();
      if (peter.run().isWinners()){
        //System.out.println("Peter Wins");
        //peter.print("peter");
        Running.staticPrintWinner("Peter");
        break;
      }
    }
  }


}
