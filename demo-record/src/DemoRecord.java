public class DemoRecord {
 
  public static void main(String[] args) {
    //All-args Constructor
    Book book = new Book("ABC", "John");//all-args constructor
    
    //No-arg constructor
    // Book book2 = new Book();
    
    //getter
    System.out.println(book.bookName());//"ABC"
    System.out.println(book.authorName());//"JOHN"

    //Private Attributes
    //System.out.println(book.bookName); cannot access attribute so it is private
    //System.out.println(book.authorName);cannot access attribute so it is private

    //No Setter in record 

    //All-args Constructor
    //No-arg constructor
    //getter , setter
    // toString, equals(), hasCode()
    System.out.println( book.toString());//Book[bookName= ABC, authorName=John]
    Book book2 = new Book("ABC", "John");
    System.out.println(book.equals(book2));//true
    System.out.println("book hashCode= "+book.hashCode());
    System.out.println("book3 hashCode= "+book2.hashCode());
    //1個class 幫你record 左一堆object
    Book book3 = new Book("ABCD", "John");
    System.out.println("book3 hashCode=" + book3.hashCode());

    Book book4 = new Book(null, "Peter"); // java.lang.IllegalArgumentException
    

  }
}
