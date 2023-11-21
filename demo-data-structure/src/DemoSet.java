import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
  //use set 去數有幾多個hello
  public static int countTarget(List<String> list, String target){
      //set
      //return false -> count ++ < duplicate times
      Set<String> string = new HashSet<>();
      int count = 1;//因為第一個會加左入去
      for (String str: list){
        if( !string.add(str) && str.equals(target)){
          count ++;
        }
      }
      
      return count;
  }

  public static void filterDuplicated (List<String> list){
    Set<String> string = new HashSet<>();
    //loop 2 times
    for (String str: list){
      string.add(str);
    }
    //already remove duplicated elements
    list.clear();
    for (String str : string) {
      list.add(str);
    }
  }

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("hello");
    strings.add("world");
    strings.add("world");
    //add method -> filter duplicate element
    //filter -> use for loop to check duplicate times

    Set<String> strings2 = new HashSet<>();//interface
    System.out.println(strings2.add("hello"));
    System.out.println(strings2.add("world"));
    System.out.println(strings2.add("world"));
    System.out.println(strings2);//hello, world


    List<String> strs = List.of("hello","world","world","hello","hello","XYZ");
    int count = 0;
    for (String str : strs) {
      if (str.equals("hello")){
        count ++;
      }
    }
    //1. Count Duplicate elements
    System.out.println(countTarget(strs, "hello"));//3
    //2. Filter out duplicate elements
    //create a new arraylist , 因為list.of唔可以操作-> .clear / .add
    List<String> strList = new ArrayList<>(List.of("hello","world","world","hello","hello","XYZ"));
    filterDuplicated(strList);
    System.out.println(strList);//[world, XYZ, hello]
    
    Set<String> set = new HashSet<>();
    set.add("abc");
    System.out.println(set.size());//1

    


  }
  
}
