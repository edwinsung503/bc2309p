package Olympic;

public class Mary implements Running{
  
  private int speed ;

  private Arena arena;

  public void setX (int speed) {
    this.speed = speed;
  }

  public int getX () {
    return this.speed;
  }

  public Mary(int speed) {
    this.speed = speed;
    this.arena = new Arena();//set 返個starting point
  }
  
  public Arena getArena(){
    return this.arena;
    
  }

  @Override
  public void accelerate(){
    this.speed +=10;
  }

  @Override
  public Mary run(){//how to move 
    int newX = this.arena.getX() + this.speed / 10;
    this.arena.setX(newX);
    return this;
  }

  public boolean isArrived() {
    return this.arena.getX() >=100;
  }

  public boolean isWinners(){
    return this.isArrived();
  }




}
