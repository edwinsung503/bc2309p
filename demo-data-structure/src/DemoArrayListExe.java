import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayListExe {

  public static void main(String[] args) {
    ArrayList<String> str = new ArrayList<>();

    str.add("hello");
    str.add("world");
    str.remove(1);
    for (String strs : str) {
      System.out.println(strs);
    }

    ArrayList<Integer> num = new ArrayList<>();

    int i = 0;
    while (++i <= 10) {
      num.add(i);
    }
    for (Integer nums : num) {
      System.out.println(nums);
    }

    System.out.println(num.get(2));
    System.out.println(num.size());//10
    System.out.println(num.isEmpty());
    num.set(2,100);
    System.out.println(num.get(2));

    num.remove(Integer.valueOf(100));
    num.add(null);
    System.out.println(num.size());//10

    System.out.println(num.contains(2));
    System.out.println(num.contains(null));

    System.out.println(num.subList(0, num.size()));

    ArrayList<Integer> num1 = new ArrayList<>();
    num1.add(1001);
    num1.add(1002);

    num1.addAll(num);
    System.out.println(num1);
    System.out.println(num1.indexOf(1001));
    num1.add(1001);
    System.out.println(num1.lastIndexOf(1001));

    num1.add(1,10002);
    System.out.println(num1);

    ArrayList<Integer>  removeList = new ArrayList<>();
    removeList.add(1001);
    removeList.add(10002);
    num1.removeAll(removeList);
    System.out.println(num1);

    Integer [] arr2 = num1.toArray(new Integer[0]);
    System.out.println("arr2= "+Arrays.toString(arr2));//

    Object [] arr3 = num1.toArray();
    Integer [] result = new Integer[arr3.length];
    int k =0 ;
    for (Object obj : arr3) {
      if (obj ==null){
        result [k++] = null;
      } else if (obj instanceof Integer) {
        result [k++] = (Integer) obj;
      }
    }

    System.out.println(Arrays.toString(arr3));
    System.out.println(Arrays.toString(result));

    ArrayList<String> str4 = new ArrayList<>();
    List<String> str5 = new ArrayList<>();

    




    
  }
  
}
