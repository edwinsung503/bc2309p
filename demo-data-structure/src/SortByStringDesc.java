import java.util.Comparator;

public class SortByStringDesc implements Comparator<String>{

  @Override
  public int compare(String s1, String s2){
    return s2.compareTo(s1) > 0 ? 1:-1;

  }
  
}
