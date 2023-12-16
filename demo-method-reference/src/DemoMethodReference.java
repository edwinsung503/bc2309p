import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class DemoMethodReference {
  
  private static List<String> strings = new ArrayList<>(List.of("IJK","ABC","XYZ"));
  public static void main(String[] args) {
    //Approach 1
    //Method Reference -> Lambda expression
    strings.forEach(System.out::println);//new verion in java 8 for only 1 varaible
    //Approach 2
    strings.forEach(e -> System.out.println(e));//old version 

    //Function<T,R> Lambda expression: i -> "Hello".charAt(i)
    //Approach 2 
    Function<Integer, Character> charAFunction = i -> "hello".charAt(i) ;
    //Approach 1 -> Method Reference -> Lambda expression
    Function<Integer, Character> charAFunction2 = "hello"::charAt;

    //Compar
    //Approach 2 
    Comparator<String> compareTo = (s1,s2) -> s1.compareToIgnoreCase(s2);
    //Approach 1 -> Method Reference -> Lambda expression
    Comparator<String> compareTo2 = String :: compareToIgnoreCase;

    Collections.sort(strings,compareTo2);
    System.out.println(strings);//[IJK, ABC, XYZ] -> [ABC, IJK, XYZ]

    //ClassName :: new
    //Approach 2`
    Function<String,Integer> newInteger = s -> new Integer(s);
    //Approach 1 
    Function<String,Integer> newInteger2 = Integer:: new ;


  }
}
