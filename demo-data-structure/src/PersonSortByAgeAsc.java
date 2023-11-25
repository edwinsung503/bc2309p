import java.util.Comparator;

public class PersonSortByAgeAsc implements Comparator<Integer>{

  @Override
  public int compare(Integer a1,Integer a2){
    return a2.compareTo(a1) > 0 ?1:-1;
  }
  
}
