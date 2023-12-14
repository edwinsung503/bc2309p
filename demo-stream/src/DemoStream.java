import java.util.ArrayList;
import java.util.Comparator;
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
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("John",12));
      persons.add(new Person("Mary",22));
      persons.add(new Person("Peter",23));

      //stream.map() -> ("John","Mary","Peter");
      List<String> result = persons.stream()//
        .map( e -> e.getName())//
        .collect(Collectors.toList());
      System.out.println(result);

      List<BookStore> bookStores = new ArrayList<>();
      bookStores.add(new BookStore("Mary", List.of ("ABC","AAA")));
      bookStores.add(new BookStore("Peter", List.of ("BAC","AAA","DES")));
      

      //StoreOwner
      List<StoreOwner> owners = persons.stream()//
        .filter(p -> {
          for (BookStore bs : bookStores){
            if (p.getName().equals(bs.getOwner())){
              return true;
            }
          }
          return false;
        })
        .map(e -> {//e is a person object
          for (BookStore bs : bookStores){
            if (e.getName().equals(bs.getOwner())){
              return new StoreOwner(bs.getOwner(),e.getAge() ,bs.getBooks());
            }
          }
          return null;
        }).collect(Collectors.toList());
      System.out.println(owners);


      //Find the List<Stirng> names, who has a bookstore, can contain the "AAA" book
      List<String> nameList = persons.stream()//
        .filter(p -> {
          for(BookStore bs1 : bookStores){
            if(p.getName().equals(bs1.getOwner()) && bs1.getBooks.contains("XYZ")){
              return true;
            }
          }
          return false;
        })  
        .map(p -> p.getName())//改變形態
        //.filter(p.startsWith("M"))//
        .collect(Collectors.toList());

      System.out.println(nameList);


      //sorted()
      List<String> nameList2 = List.of("Jenny","Mary","John");

      //already create an object that has the formula s2.compareTo(s1)
      Comparator<String> descendingName = (s1, s2) -> s2.compareTo(s1);
      nameList2.stream()//
      .sorted(descendingName)//
      .forEach(e -> System.out.println(e));
      

      //Stream.class
      //List.stream 的形態
      Stream<String> ss3 = Stream.of("ABC","AAA","XYZ","IJK");
      ss3.filter(e -> e.startsWith("A"))//
      .forEach(e-> System.out.println(e));

  }
}
