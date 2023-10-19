package transporation;

public class Taxi implements Moveable{
  
  private int speed;

  private Location location;

  public void setSpeed(int speed){
    this.speed = speed;
  }

  public int getSpeed(){
    return this.speed;
  }


  public Location getLocation(){
    return this.location ;
  }

  //Constructor
  public Taxi (int speed){
    this.speed = speed;
    this.location =new Location();//set New Location
    
  }

  @Override
  public Taxi move(){
    //
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this;
  }
  //taxi 移動速度令個location 改變
  @Override
  public void accelerate(){
    this.speed +=30;
  }

  public boolean isArriveDestination(){
    return this.location.getX() >=100 ; 
  }

  
  public boolean isWinner(){
    return this.isArriveDestination();
  }
  
}
