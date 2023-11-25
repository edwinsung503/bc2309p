import java.util.Comparator;

public class PersonSortByNameAsc implements Comparator<String> {
  
  @Override
  public int compare(String n1,String n2){
    return n2.compareTo(n1) > 0 ?1:-1;
  }
}
