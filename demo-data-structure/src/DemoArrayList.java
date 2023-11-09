import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
  
  public static void main(String[] args) {
    
    //Array - Kind of data structure (fixed memory location and fixed size)
    String [] strings = new String [5];//Fixed size (java.lang.String) - default 自動引入

    for (int i = 0 ; i< strings.length; i++){
      strings[i] = "hello";
    }
    //strings[5] = "hello"; // java.lang.ArrayIndexOutOfBoundException

    //ArrayList.class, 係一個class
    ArrayList<String> string2 = new ArrayList<>();//Variable size
    string2.add("hello");//array is removed ,and new another array
    string2.add("hello");
    string2.add("hello");
    string2.add("hello");
    string2.add("hello");
    for (String str : string2) {
      System.out.println(str);
    }

    //ArrayList -> 1 -10
    //Store the numbers which can be divided by 3
    //while loop
    //
    ArrayList<Integer> integers = new ArrayList<>();// 唔可以放primitive 
    int i =0;
    while (++i <=10) {
      //integers.add(Integer.valueOf(i));//main writing
      if (i % 3 ==0) {
        integers.add(i);// i - > primitive , why can use primitive -> Wrapper class (auto-box)
        //int 自動上Integer 
      }
    }
    for (Integer integer : integers){
      System.out.println(integer);
    }

    //ArrayList considers ordering

    //set()
    integers.set(1, 10);
    for (Integer integer : integers){
      System.out.println(integer);//3,10,9
      //set the 2nd element to 10
    }
    //ArrayList is high level implementation
    //integers.get(2);
    //get()
    System.out.println(integers.get(2));//9

    //size()
    System.out.println(integers.size());//3

    //add null
    integers.add(null);// 無野但X住1個位置
    System.out.println(integers.size());//4

    //isEmpty
    System.out.println(integers.isEmpty());//false

    //remove() by index
    integers.remove(2); // remove 某index object
    //remove the 3rd object 
    System.out.println(integers.size());//3

    System.out.println(integers.get(0));//3
    System.out.println(integers.get(1));//10
    System.out.println(integers.get(2));//null
    
    //remove() by object
    integers.remove(Integer.valueOf(10));// remove object referene -> remove address
    //object 係新create -> , 揾到value = 10, 就remove 
    System.out.println(integers.size()); //2
    System.out.println(integers.get(0)); //3
    System.out.println(integers.get(1)); //null


    System.out.println(integers.contains(3));//true
    System.out.println(integers.contains(null));//true
    System.out.println(integers.contains(9));//false

    System.out.println(integers.subList(0, integers.size()));//3,null

    ArrayList<Integer> integers2 = new ArrayList<>();
    integers2.add(1000);
    integers2.add(2000);

    //addAll()
    integers2.addAll(integers);
    System.out.println(integers2);//[1000,2000,3,null]
    
    //indexOf
    System.out.println(integers2.indexOf(1000));//0
    integers2.add(1000);
    System.out.println(integers2.lastIndexOf(1000));//4


    //add (index, element) -> insert
    integers2.add(2,1500);
    System.out.println(integers2);//[1000, 2000, 1500, 3, null, 1000]

    //removeAll()
    ArrayList<Integer> removeList = new ArrayList<>();
    removeList.add(2000);
    removeList.add(1500);
    integers2.removeAll(removeList);
    System.out.println(integers2);//[1000, 3, null, 1000]

    //Conversion to Array (ArrayList to Array)
    //ArrayList<Integer> -> Integer []
    //Case 1
    Integer [] arr = integers2.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arr));
    
    //Case 2
    Object [] arr2 = integers2.toArray();
    Integer [] result = new Integer[arr2.length];
    int k = 0;
    for (Object obj : arr2) {
      if (obj ==null) {
        result[k++] = null;
      } else if (obj instanceof Integer) {// if it is Integer class -> 放返入去
        result[k++] = (Integer) obj;
      }
    }
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(result));

    //List
    ArrayList<String> string3 = new ArrayList<>();
    List<String> string4 = new ArrayList<>(); // 唔可以new List -< 因為list 係一個interface
    //只可以call List 入面的method ArrayList > List 的method

    //ArrayList.class implement Interface List
    //so, the method in List must be implement by ArrayList, but ,
    //some methods in ArrayList may not be in List

    string3.add("hello");
    string4.add("hello");

    string3.remove("hello");
    string4.remove("hello");
    System.out.println("String3= "+string3);
    System.out.println("String4= "+string4);

    

  }

}
