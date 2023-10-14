public class SmallBird extends Bird{//small bird also extend object
  
  public SmallBird(String name) {
    super(name,name);
  }

  //Cannot override the "final" fly() method in Bird.class
  //@Override
  //public void fly(){}
  
  public static void main(String[] args) {
    Bird b1 = Bird.valueOf("John");
    SmallBird sm1 = new SmallBird("ABC");
    
    sm1.equals("abc");
    //要形容到2個object 係唔一用
    //點會一樣?講D attribute 分開係唔一樣

    
  }
}
