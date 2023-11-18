import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    //<key, value> pair -> Entry
    Map<String,String> stringMap = new HashMap<>();
    stringMap.put("A","Mary");
    System.out.println(stringMap.get("A"));//"Mary"
    //封裝左個for -loop 俾你用
    stringMap.put("A","John");
    stringMap.put("A2","Sally");
    stringMap.put(null,"Peggy");
    stringMap.put(null,"Edwin");
    System.out.println(stringMap.get("A"));//John
    System.out.println(stringMap.get("A2"));//Sally
    System.out.println(stringMap.get(null));//Edwin

    //Loop Map.Entry -> entrySet()
    for (Map.Entry<String, String> entry : stringMap.entrySet()){
      System.out.println("Key= "+entry.getKey()+", value= "+entry.getValue());
    }

    //Loop value -> 
    for (String value : stringMap.values()){
      System.out.println("value: "+value);//次序: 亂序
    }

    //KeySet()

    for (String key : stringMap.keySet()){
      System.out.println("Key: "+ key);
    }
    System.out.println(stringMap.containsKey("A"));//true

    String [] strings = {"John","hello","Oscar","oscar","Vincent"};
    //check if the value exists in map,
    //if no, add into the map , 
    //if yes, print "John already exit"

    //containvalue
    for (String str : strings) {
      if (! stringMap.containsValue(str)){
        stringMap.put("", str);
      } else {
        System.out.println(str+"alread exit");
      }
    }

    for (Map.Entry<String, String> entry : stringMap.entrySet()){
      System.out.println("Key= "+entry.getKey()+", value= "+entry.getValue());
    }

    int count = 0;
    public String genKey (int count){
      return "G".concat(++count); 
    }


    

  }
}
