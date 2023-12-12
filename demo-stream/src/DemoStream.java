import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    //Stream -> (Predicate + Consumer)

    int total = 4;
    int sum = 0;
    List<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("DEF");
    strings.add("XYZ");
    strings.add("ABC");
    for (String n : strings){
      if (n.length() <=3) {
        System.out.println(n);
        total += n.length();
      }
    }

    //Stream
    //After Java 8 -> Stream
    //void -> execute 
    //not void -> return stream of sth
    strings.stream()//.stream return  -> List<String> -> Stream<String ->> 新型態
      .filter(str -> str.length() <=3 && str.startsWith("ABC")  && sum == 4 )//.filter(Predicate<? super String> predicate) -> intermediate operation -> return stream(sth)
      //.filter(str -> str.startsWith("mary"))//
      //return this-> 可以繼續.filter
      .forEach(str -> {//(Consumer<? super String> action) -> terminate operation
        System.out.println(str);
        //sum += str.length();
        //Stream does note allow "Write" operation on teh variable 
        //Local variable total defined in an enclosing scope must be final or effectively final
        //只可以read 唔可以read 
        //Stream 只可以用係依個block 入面的野, 但唔可以累積d野, 只係修尾的野
      });

      //Stream will wait terminate operation to start intermediate operation
      Stream<String> ss = strings.stream() .filter(s -> s.charAt(2) =='F');// 出boolean
      System.out.println(strings.size());//3
      System.out.println(ss);
      System.out.println(ss.count());//1, terminate operation

      //List -> convert data structure -> List -> Set
      Set<String> ss2 = strings.stream()
        .filter(s -> s.length() <=3)
        .collect(Collectors.toSet());//Collectors.toSet() return HashSet-> 背書

      ss2.stream().forEach(strs -> {
        System.out.println(strs);
      });
      //Set 幫你消化左個ABC


      List<String> ns = strings.stream()//
        .filter( s -> s.length() > 3)//
        .map( s -> {
          return s.concat("Hello");
          //return "hello";
        }).collect(Collectors.toList());// return to a new List strings with Hello
        //-> 將入面的每一個element 去加工;
        //new 左一個新的arrayList

        //extend < 或者以下 




  }
}
