package revision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevisionArrayListPhone {
  public static void main(String[] args) {
    List<Phone> phones = new ArrayList<>();
    phones.add(new Phone("Iphone 13",8499));
    phones.add(new Phone("Iphone 14", 10199));
    phones.add(new Phone("Iphone 15", 9499));

    for (Phone s : phones){
      System.out.println("(Name = "+s.getModel()+" Price = "+s.getPrice()+" )");
    }
    //phones.remove(1);
    //System.out.println(phones);
    System.out.println(phones.size());
    
    //add all the price
    int num = 0;
    for (Phone s : phones) {
      num += s.getPrice();
    }
    System.out.println(num);
    //find the average price
    num /= phones.size();
    System.out.println(num);
    //create a new arraylist
    List<Phone> phones2 = new ArrayList<>();
    //use subList
    phones2 = phones.subList(0, phones.size()-1);
    System.out.println(phones2);


    //add based on what price range
    //solution 1
    for (Phone p : phones){
      if (p.getPrice()> 10000 ) {
        System.out.println(phones);
      }
    }

    //solution 2
    System.out.println("Solution2");
    Phone removed = phones.remove(0);
    for (int i =0 ; i< phones.size(); i++){
      if (phones.get(i).getPrice()> 10000) {
        removed = phones.remove(i);
        System.out.println("Removed = "+removed);
      }
    }
    System.out.println(phones);

    //add all to set collection - hashSet
    Set<Phone> phones3 = new HashSet<>();
    for (Phone p2 : phones){
      phones3.add(p2);
    }
    
    phones3.clear();
    phones3.addAll(phones);
    //Add all the books to an Array (Book[])
    //books -> Arraylist -> Array
    Phone [] phones4 = new Phone [phones.size()];
    for (int i =0 ; i< phones.size();i++){
      phones4[i] = phones.get(i);
    }

    System.out.println(Arrays.toString(phones4));



  }

}
