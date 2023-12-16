import java.util.Optional;

//Optional<T> should be used in defining the type of attribute
//1. call API, this class may be used for deserialization , then Optional<T> may have some problems
//2. Interact with Database, deserialization for the Optional<T> field has issue
public class Person1 {
  
  private String name;

  private Optional<String> emailAdress;//NOT OK, wrong design
  //Optional 係使用家小心使用結果,所以唔會用於attribute
  //Optional<String> 似一個hub 
  //如果咁入, 會要用家去每次柝result
  public Optional<String> getEmailAddress (){//NOT OK, wrong design
    return this.emailAdress;
  }

  public Person1(String name){
    this.name = name;
  }

  public String getName(String name){
    return this.name;
  }

  public void setEmailAddress(String s){//NOT OK, wrong design
    //if (s == null){
    //  throw new IllegalArgumentException();
    //}
    this.emailAdress =  Optional.ofNullable(s);
  }
}
