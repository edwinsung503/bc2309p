package transporation;

public class Location {
  
  private int x ; // 1 - 10 (10 : Destination)

  //empty constructor
  public Location(){
    this.x = 1 ;// 起點係set 左 1
  }
  //點樣令Bus 同個road 產生關係
  public boolean isArriveDestination(){
    return x >=100 ; 
  }
  
  public void setX(int x){
    this.x = x;
  }

  public int getX(){
    return this.x;
  }

  public static void main(String[] args) {
    //One bus and one Taxi
    //while loop, isArriveDestination, exit loop
    //print bus or taxi win
    Bus bus = new Bus(10);
    Taxi taxi = new Taxi(20);
    //taxi.accelerate();
    //(!bus.getX().isArriveDestination())
    while(!bus.isWinner()
          && !taxi.isWinner()){
        bus.move();
        if (bus.move().isWinner()){
          //System.out.println("Bus is the winner");
          //bus.pritnWinner("bus");
          Moveable.staticPrintWinner("Bus");
          break;
        } 
        taxi.move();
        if (taxi.move().isWinner()) {
          //System.out.println("Taxi is the winner");
          //taxi.pritnWinner("taxi");
          Moveable.staticPrintWinner("Taxi");
          break;
        }
      
    }
    

  }

}
