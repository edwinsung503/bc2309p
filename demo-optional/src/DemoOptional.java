import java.util.Optional;

public class DemoOptional {
  
  public static void main(String[] args) {
    String s = null;

    Optional<String> os = Optional.ofNullable(null);//optional 裝住一個String object 係Null
    Optional<String> os1 = Optional.empty();//no value

    if (os.isPresent()){
      System.out.println(os.get());
    } else {
      System.out.println("os's String is a null value");
    }

    if (os1.isPresent()){// os 1 is not null, but os1's value is null
      System.out.println("os1 present");
    } else {
      System.out.println("os1 is not present");
    }
    Optional<String> os3 = Optional.ofNullable("John");
    os.ifPresent(e -> {
      System.out.println(e);
    });

    //ofNullable() vs of()
    //Optional cannot store null value
    //Optional<Integer> oi = Optional.of(null);//error
    //if (oi.isPresent()){
      //System.out.println("present");
    //}
    Optional<Integer> oi = Optional.of(10);//Auto-box;



  }
}
