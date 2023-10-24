import java.util.Objects;

public class Bird {//任何class 都有implicitly extends Object.class < 無寫但本身都有依個Object class
  

  private String name;

  private int age;

  public final static String color = "Yellow";//無得再改, 但隻color 就永遠係黃色
  //final 無static -> instance variable 不可以被修改- 因為belong to Bird 
    //如果有static 就可以改, 唔belong to anyone- 跟share 的attribute -> 唔可以再用setter/getter 去改
    //**Static 同唔用static 的分別 */

  //Constructor;
  //有名俾落去的constructor -> 控制control 的人點控制隻bird 形
  public Bird (String name,String color){
    this.name = name;
    //this.color = color;//因為final instance variable 不可以被修改,但仲有color
  }
  public Bird () {//name default value null; color : yellow

  }

  public static Bird valueOf(String name){//想Bird.valueOf- > static method -> class.methodname
    return new Bird(name,name); //** */
  }

  public void setName(String name){//new Bird ("John")
    this.name =name;
  }

  public void setAge(int age){//new Bird ("John")
    this.age =age;
  }

  //setter color ;> 用家可以用以個去改color
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
  public String getColor(){
    return this.color;
  }
  @Override//child override parent 的野
  //Check 2個object (B1 & B2) 係same content
  public boolean equals(Object obj) {//b1.equals (b2) -> false -> true
    if (this == obj) {//b1.equal = this,== object reference
      return true;  
    //First, it checks if the object passed as a parameter is the same as the current object, 
    //using the == operator. This compares the references of the objects, not their content. 
    //If they are the same, then the method returns true, since they are equal by definition.
    }
    if (!(obj instanceof Bird)) {
      return false;
    }

    //Second, it checks if the object passed as a parameter is an instance of the Bird class, 
    //using the instanceof operator. This ensures that the objects are of the same type and can be compared. 
    //If the object is not an instance of Bird, then the method returns false, since they are not equal by type.

    //肯定左obj 係bird
    Bird bird = (Bird) obj;//downcase -> getName
    //Third, it casts the object passed as a parameter to a Bird object, using the (Bird) operator. 
    //This allows accessing the fields and methods of the Bird class from the object. 
    
    //return bird.getName().equals(this.name);//equals 就有return , Check String by equals(),"john"
    return Objects.equals(bird.getName(), this.name) && Objects.equals(bird.getAge(), this.age);
    //citizen 用HKID 去用equal 分别2個人
    //Then, it compares the fields and methods of the Bird object with those of the current object, 
    //using the equals method or other appropriate operators. If they are all equal, 
    //then the method returns true, since they are equal by content. Otherwise, it returns false.

  }
  @Override
  public int hashCode(){
    return Objects.hash(this.name,this.age);

    //The hashCode method is used to return a hash code value for an object, 
    //which is an integer that represents the object's identity.
    //  If two objects are equal according to the equals method, 
    //then calling the hashCode method on each of them must produce the same integer result.
  }
  //test 下發生什麼事

  //final field Bird.color cannot be assign
  //public void setColor(String color) {
    //this.color = color;
  //}

  @Override//Check Parent -> Object
  public String toString() {  
    return "Bird(name= "+this.name+", color="+this.color+")";
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

    //萬一下面係什麼type /型態所以防止個出什機先做
    //對complie time vs runtime 理解
    //complie time 係check 文法
    //runtime 係check 你個例子係咪對應到個porgram

    if (object instanceof Bird ){ //if true -> 先行bird
      //downcase from Object.class to Bird.class
      //object 係最高, 只可以downcase
      Bird b = (Bird) object;
      b.fly();//用bird declare 的object所以可以fly
    } else if (object instanceof String) {//declare 返個object 所以寫返downcase from object
      String c = (String) object;
      System.out.println(c.length());
    } else if (object instanceof Integer) {
      Integer i = (Integer) object;
      System.out.println(i.intValue());
    } else if (object instanceof Double ) { 
      Double d = (Double) object;
      System.out.println(d.doubleValue());
    }

    object = new int [5][2];
    //Exe , 抽走if condition
    //try 放個integer 入去, 睇下會點, class not matching
    //object = 100;//Integer.class

    //可以唔開放CONSTRUCTOR
    Integer i1 = Integer.valueOf("100");//100
    Integer i2 = new Integer("100");//100

    Bird b1 = new Bird("John", color);
    Bird b2 = Bird.valueOf("John");

    String s = String.valueOf(100);
    System.out.println(s.charAt(2));

    System.out.println(b1.equals(b2));//false -> change to true
    //因為check object reference , new 左2次,所以係ram 唔同位
    //row 101 /102 想係同一個bird , 唔想係同一個就要寫D 野分開佢

    System.out.println(b1.hashCode());//-> 71751670
    System.out.println(b2.hashCode());//-> 71751670 hashcode 去認係咪同一個object
    //令到個hashcode 一樣

    b1.setAge(20);
    b2.setAge(12);
    System.out.println(b1.equals(b2));
    System.out.println(b1.hashCode());//71751690
    System.out.println(b2.hashCode());//71751682




    
  }

}
