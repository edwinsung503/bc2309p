package Olympic;

public class Peter implements Running{

  private int speed ;

  private Arena arena;

  public void setSpeed(int speed){
    this.speed = speed;
  }

  public int getSpeed(){
    return this.speed;
  }

  public Arena getArena(){
    return this.arena ;
  }

  public Peter(int speed) {
    this.speed = speed;
    this.arena = new Arena();
  }
  @Override
  public Peter run(){
    int newX = this.arena.getX() + this.speed / 10;
    this.arena.setX(newX);
    return this;
  }
  @Override
  public void accelerate(){
    this.speed +=10;
  }
  
  public boolean isArrived() {
    return this.arena.getX() >=100;
  }

  public boolean isWinners () {
    return this.isArrived();
  }

  
}
