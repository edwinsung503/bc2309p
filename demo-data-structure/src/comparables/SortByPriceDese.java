package comparables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPriceDese implements Comparator<Book>{

  @Override
  public int compare(Book o1, Book o2){
    return o1.getPrice() > o2.getPrice() ? 1 :-1;
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>(List.of(new Book("A", 30.5),new Book("B", 50.8),new Book("C", 40.5)));

    Collections.sort(books, new SortByPriceDese());
    System.out.println(books);
    //無call 到compare 但可以Compare 因為個object 有compare method
  }
  
}
