package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book>{//合約->Comparable <Book> 約定好的合約

  private String name;

  private double price;

  public double getPrice (){
    return this.price;
  }
  public Book (String name, double price){
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString(){
    return "(Book name= "+ this.name + ", Book price= "+this.price+") "; 
  }

  //public int compareTo(T o)
  //sorting ->排序用
  //price 由細至大/大至細 
  @Override
  public int compareTo(Book book){//the larger price , come first
    if (book.getPrice() < this.price) {//可以使用compareTo 只係 book 
      return 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>(List.of(new Book("A", 30.5),new Book("B", 50.8),new Book("C", 40.5)));

    //Sorting
    Collections.sort(books) ;//.sort -> call compareTo(T o)-> 有人call 左個method
    System.out.println(books);

    //what + how + why : use interface

    //-> 同用家產生一個約定-> 關係-> user 必須要俾一個method
    
  }
  
}
