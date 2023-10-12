public class Bird {//任何class 都有implicitly extends Object.class < 無寫但本身都有依個Object class
  

  private String name;

  public final String color = "Yellow";
  //final 無static -> instance variable 不可以被修改- 因為belong to Bird 
    //如果有static 就可以改, 唔belong to anyone- 跟share 的attribute
    //**Static 同唔用static 的分別 */
    
  public String getColor(){
    return this.color;
  }
  //final field Bird.color cannot be assign
  //public void setColor(String color) {
    //this.color = color;
  //}

  @Override//Check Parent -> Object
  public String toString() {
    return "Bird(name= "+this.name+")";
  }
  //Final method cannot be Overriden
  public final void fly(){
    System.out.println("this is final fly() method.");
  }

  
  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.toString();//Object 入面有toString 依個method
    System.out.println(bird.toString());//print 左個bird 的obejct reference > 係stack 果個野地址/名字
    //Bird(name= null)-> string class default value = null

    Object object = new Object();// << java 自帶有的method such as equal() / hascode()
    object = "123";
    System.out.println(object.getClass());//class java.lang.Double
    object = 123;
    System.out.println(object.getClass());//class java.lang.Double
    object = 0.0;
    System.out.println(object.getClass());//class java.lang.Double
    //object 背後有type ,什麼都可以放入去

    object = new Bird();//放隻Bird 入去
    System.out.println(object.getClass());//class Bird

    //Object 可以盛裝所有野
    //object.fly() << .唔到fly 因為佢無fly 依個method

    //bird 同object 係Parent 可以up down(implicitly)
    //Object 係任何人的父母
    if (object instanceof Bird ){ //if true -> 先行bird
      //downcase from Object.class to Bird.class
      Bird b = (Bird) object;
      b.fly();//用bird declare 的object所以可以fly
    }
    //Exe , 抽走if condition
    //try 放個integer 入去, 睇下會點, class not matching
    //object = 100;//Integer.class





    
  }

}
