package transporation;

public class Location {
  
  private int x ; // 1 - 10 (10 : Destination)

  
  public Location(){
    this.x = 1 ;// 起點係set 左 1
  }

  public boolean isArriveDestination(){
    return x >=100 ; 
  }
  //點樣令Bus 同個road 產生關係
  
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
    Bus bus = new Bus(30,"bus");
    Taxi taxi = new Taxi(20);
    //taxi.accelerate();
    //(!bus.getX().isArriveDestination())
    while(!bus.isWinner()
          && !taxi.isWinner()){
        bus.move();
        if (bus.move().isWinner()){
          //System.out.println("Bus is the winner");
          //bus.pritnWinner("bus");
          Moveable.staticPrintWinner();
          break;
        } 
        taxi.move();
        if (taxi.isWinner()) {
          //System.out.println("Taxi is the winner");
          //taxi.pritnWinner("taxi");
          Moveable.staticPrintWinner();
          break;
        }
      
    }
    

  }

}
