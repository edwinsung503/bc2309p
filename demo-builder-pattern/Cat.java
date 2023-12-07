public class Cat {

  private String name;

  public void setName(String name){
    this.name = name;
  }

  public Cat name(String name) {
    this.name = name;
    return this;//this -> C at return出去
  }

  public void run(){
    System.out.println(this.name +" running ...");
  }
  
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.name("John").run();//John is running
    //cat.setName("John");
    //cat.run();
  }
}
