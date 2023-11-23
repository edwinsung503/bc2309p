import java.util.Comparator;

public class SortByIntegerDesc implements Comparator<Integer>{
  
  @Override
  public int compare(Integer x, Integer y){
    return y.compareTo(x) > 0 ? 1:-1;
  }
}
