import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {
  
  public static void main(String[] args) {
    String [] strings = new String[] {"abc","def","ijk"};
    for (String s : strings){
      System.out.println(s);
    }
    List<String> list1 = List.of("abc","def","ijk");
    List<String> list2 = new ArrayList<>(List.of("abc","def","ijk"));
    //好少用以下的for each
    for (String s: list2) {
      System.out.println(s);
    }
    //forEach (Consumer <? super T> action)
    //forEach (Consumer < String > method)

    //較moden 寫法
    Consumer<String> consumer = new Sysout();
    list2.forEach(consumer);

    Consumer<String> consumer2 = x -> System.out.println("Hello "+x);
    list2.forEach(consumer2);
    //突破class 的制X
    //list2.forEach(new Sysout());

    //Consumer -> consume(消耗) -> return nothing
    //String -> Super T
    //Consumer : x -> {}
    list2.forEach(x-> {
      System.out.println("Hello "+ x);
    });
  }
}
