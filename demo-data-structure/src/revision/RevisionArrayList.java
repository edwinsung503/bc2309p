package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevisionArrayList {
  
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    //create a new object -> 
    books.add(new Book("edwin", 33));
    books.add(new Book("Pegg", 43));
    books.add(new Book("Ally", 63));

    for (Book s : books){
      //System.out.println(s.getName()+", "+s.getPrice());
      System.out.println(s.getName()+"+ "+String.valueOf(s.getPrice()));
    }

    // average 
    //array [] -> arr.length
    //String -> arr.length()
    //ArrayList<>() -> book.size() 
    books.size();
    double num = 0;
    //BigDecimal ??
    for (Book n : books) {
      num += n.getPrice();
    }
    num /= books.size();
    System.out.println("The average prices of books = "+num);// double / int -> double 
    List<Book> books2 = new ArrayList<>();
    books2 = books.subList(1, books.size()-1);//< return a new object address
    // books refer to original list Books
    Book removed = books.remove(0);
    
    //remove all the books price > 50
    //for each -> 唔可以add / remove , 因為上鎖個collection -> list
    for (Book b: books){
      if (b.getPrice() > 50.0) {
        //b.remove(book);< cannot 
        //b.add(book); < cannot 
        System.out.println(books);
      }
    }
    for (int i=0; i< books.size(); i++){
      if ( books.get(i).getPrice() > 50.0) {
        removed = books.remove(i);
        System.out.println(removed);
      }
    }
    System.out.println(books);

    //add all the books to a set collection -> (HashSet)
    Set<Book> books3 = new HashSet<>();
    for (Book book : books){
      books3.add(book);
    }
    System.out.println("Book3= "+books3);
    books3.clear();// 唔再指住Object

    books3.addAll(books);
    //Add all the books to an Array (Book[])
    //books -> Arraylist -> Array
    Book [] books4 = new Book[books.size()];
    for (int i=0; i< books.size(); i++) {
      books4[i] = books.get(i); 
      //books.get(i)<- ArrayList 內的排 i 的element
    }
    System.out.println("Book4 = "+Arrays.toString(books4));
  }
}
