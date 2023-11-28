package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisionHashMapPhone {
  
  public static int counter = 0 ;

  private static final String KEY_PREFIX = "A";

  public static String genKey(){
    return KEY_PREFIX + ++counter;
  }

  public static Phone putNew(Map<String , Phone> phoneMap,Phone phones){
    phoneMap.put(genKey(),phones);
    return null;
  }

  public static void main(String[] args) {
    //generate a key -> "B1","B2","B3"
    Map<String , Phone> phoneMap = new HashMap<>();
    phoneMap.put(genKey(), new Phone("Iphone 13", 1199));
    phoneMap.put(genKey(), new Phone("Iphone 14", 199));
    
    //adding HashMap value into a List
    List<Phone> phones = new ArrayList<>();
    for (Map.Entry<String, Phone> entry : phoneMap.entrySet()){
      phones.add(entry.getValue());
    }
    System.out.println(phones);

    //want a generic code for adding key
    //create a static method
    //class. method
    RevisionHashMapPhone.putNew(phoneMap,new Phone("Iphone 15",11999));
    System.out.println(phoneMap);



  }
}
