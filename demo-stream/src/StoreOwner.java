import java.util.List;

public class StoreOwner {
  
  private String name;

  private int age;

  private List<String> books;

  public StoreOwner (String name, int age , List<String> books){
    this.name = name;
    this.age = age;
    this.books = books;
  }

  public String getName (String name){
    return this.name;
  }
  public int getAge (int age){
    return this.age;
  }

  public List<String> getBooks(){
    return this.books;
  }

  public String toString(){
    return "StoreOwner("//
      +"name= "+this.name//
      +", age= "+this.age//
      +", book= "+this.books;
  }


}
