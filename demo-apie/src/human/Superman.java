package human;

public class Superman extends Human implements Superpower, Life{

  //y cannot extend two class -> 唔知繼承from who
  //but can implement two class -> 因為一定有implement
  //interface - abstract - > child 一定override
  //extend 唔一定有繼承
  //
  
  @Override
  public void fly(){
    System.out.println("I am Superman, and flying...");
  }

  @Override
  public void eat(){
    System.out.println("I am Superman, and eat ....");
  }

  @Override
  public void drink(){
    System.out.println("I am Superman, and drink ....");
  }

  @Override
  public void run(){

  }





}
