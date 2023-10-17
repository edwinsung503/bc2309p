package transporation;

public class Bus implements Moveable{//implements 理行依個合約

  private int speed;

  private String name;

  private Location location;//(position / location)

  public void setSpeed (int speed){
    this.speed = speed;
  }
  public void setName (String name){
    this.name = name;
  }
  public int getSpeed (){
    return this.speed;
  }

  public String getName() {
    return this.name;
  }
  
  public Location getLocation(){
    return this.location;
  }
  public Bus (int speed, String name){
    this.speed = speed;
    this.name = name;
    this.location = new Location();//起個起點-> 1 個Location
  }
  
  @Override
  public Bus move(){ // call method of move
    //location x, +1 when speed = 10, +2 when speed = 20
     //find 原有location first
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this; //return bus
  }

  @Override
  public void accelerate(){
    this.speed +=10;
  }

  public boolean isArriveDestination(){
    return this.location.getX() >=100 ; 
  }

  public boolean isWinner(){
    return this.isArriveDestination();
  }

  //Write a method to common the below System.out.println("Taxi is the winner");
  //放個Bus 入去

  
  

}
