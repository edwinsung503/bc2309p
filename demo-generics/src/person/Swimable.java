package person;

import java.util.List;

public interface Swimable {
  
  int swim();

  public static <T extends Swimable> int totalMeters (List<T> objects){
    int total =0 ;
    for (T t: objects){
      total += t.swim();
    }
    return total;
  } 
}
