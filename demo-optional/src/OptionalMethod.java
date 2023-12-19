import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;

public class OptionalMethod {
  
  public static String [] database = new String [] {"xyz", "abc","ijk"};

  public static List<String> database2 = List.of("xyz", "abc","ijk") ;

  public static List<Person123> database3 = List.of(new Person123("John"), new Person123("Mary"),new Person123("Cherry")) ;


  public static void main(String[] args) {
    Optional<Integer> result = OptionalMethod.fromDatabase("abc");

    //Result
    //Common use case : Optional<T> as a return type

    //Approach 1 -> isPresent() + get()
    if (result.isPresent()){
      System.out.println(result.get()); //1
    } else {
      System.out.println("Not Found");
    }

    //唔會有出現runtime exception
    //Approach 2 -> orElse()
    Integer integer = result.orElse(null);//如果揾唔到OK, 俾個0 佢

    //**Approach 3 : ifPresent()
    result.ifPresent(e -> {
      System.out.println("integer ="+e);
    });
    //throw new RuntimeException();

    //*Approach 4 orElseThrow
    result.orElseThrow(() -> new RuntimeException());
    System.out.println(result);


    System.out.println(database2.indexOf("abc"));



  }
  //話俾你知有null exception,就算唔無handle 咁做都無事
  public static Optional<Integer> fromDatabase(String x){
    for (int i=0; i<database.length;i++){
      if (x.equals(database[i])){
        return Optional.of(i);
        //The Optional.of() method in Java 
        //is used to create a non-empty Optional object that contains a non-null value. 
      } 
    }
    return Optional.empty();
    //The Optional.empty() method in Java is used to create an empty Optional object. 
    //create an empty Optional object-> Optional 內一定有Object , 即使入面無野, 咁寫係比較安全
  }

  public static Optional<Integer> fromDatabase2(String s){
    Optional<String> os =  database2.stream()//
      .filter(e -> "abc".equals(e))//"abc"
      //無得用map() 因為filter 後得返String, not listOf String
      //.map(e -> e.)//想揾返個word 的 index, 但得返String, 無得揾
      .findFirst();//揾第一個item
    if (!os.isPresent()){
      return Optional.of(-1);
    }
    return Optional.of(database2.indexOf(os.get()));
  }

  //findFirst()
  public static Optional<Person123> fromDatabase3 (String name){
    //Find Person by name in database3
    if (name == null){
      throw new IllegalArgumentException();
    }
    return database3.stream()//
      .filter(e -> name.equals(e.getName()))//
      .findFirst();
  }
}
