package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisionHashMap {

  public static int counter = 0;

  private static final String KEY_PREFIX = "B";

  public static String genKey(){
    return KEY_PREFIX + ++counter;
  }

  public static Book putNew(Map<String,Book> bookMap,Book books){
    bookMap.put(genKey(), books);
    return null;
  }
  public static void main(String[] args) {
    //generate a key -> "B1","B2","B3"
    Map<String,Book> bookMap = new HashMap<>();
    bookMap.put(genKey(), new Book("Edwin", 12.2));
    bookMap.put(genKey(), new Book("dwin", 4.2));

    List<Book> books = new ArrayList<>();
    for (Map.Entry<String, Book> entry : bookMap.entrySet()){
      //System.out.println("Key= "+entry.getKey()+" Value="+entry.getValue());
      books.add(entry.getValue());
    }
    System.out.println(books);

    RevisionHashMap.putNew(bookMap, new Book("Edwin", 34.2));
    System.out.println(bookMap);

    
    String bookKey = "B3";
    if (!bookMap.containsKey(bookKey)){
      bookMap.put(bookKey,new Book("Peggy", 44.3));
    }
    String bookKey2 = "B4";
    if (!bookMap.containsKey(bookKey2)){
      bookMap.put(bookKey2,new Book("Chris", 14.3));
    }
    System.out.println(bookMap);

    System.out.println("key B2= "+bookMap.get("B2"));
  }
}
