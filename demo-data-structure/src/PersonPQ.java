public class PersonPQ {
  
  private String name;

  private int age;

  public PersonPQ (String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  @Override
  public String add(){
    return this.name;
  }

}
