package human;

public class Superman extends Human implements Superpower, Life{

  private String name;

  public Superman(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

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
    System.out.println("i am running");
  }

  public static void main(String[] args) {
    //Polymorphism -> 多態
    Superman s = new Superman("Tommy");
    //s is an Object reference
    //this object reference(s)is pointing to an Superman Object.

    Human h = new Superman("Mary"); 
    
    //Human h= new Human()<- 因為abstract class 唔可以new
    //h is an Object reference
    //this object reference(h)is pointing to an Superman Object.
    //during the complie time to check, 
    //h.getName(); << no getName in Obejct from h (this obejct reference)
    //no getName from h, as h is object reference declared by Huamn
    
    //during Runtime, the object performs behaviour
    h.run();// 因為human 入面有run 依個method
    //runtime 會放Superman 個object 放入去(new object), 先check work 唔work
    //hide 左superman 某D function
    //runtime 先決定new what object
    

  }





}
