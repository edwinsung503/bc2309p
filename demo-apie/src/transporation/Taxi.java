package transporation;

public class Taxi implements Moveable{
  
  private int speed;

  private String name;

  private Location location;

  public void setSpeed(int speed){
    this.speed = speed;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getSpeed(){
    return this.speed;
  }
  public String getName(){
    return this.name;
  }

  public Location getLocation(){
    return this.location ;
  }
  public Taxi (int speed){
    this.speed = speed;
    this.location =new Location();
    
  }

  @Override
  public Taxi move(){
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this;
  }

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
