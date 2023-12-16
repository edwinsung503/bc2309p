public class DemoRecord {
 
  public static void main(String[] args) {
    //All-args Constructor
    Book book = new Book("ABC", "John");//all-args constructor
    Book book2 = new Book("ABC", "John");//all-args constructor
    
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
    System.out.println(book.equals(book2));//true
    System.out.println("book hashCode= "+book.hashCode());
    System.out.println("book2 hashCode= "+book2.hashCode());
    Book book3= new Book("ABCD", "John");
    System.out.println("book3 hashCode= "+book3.hashCode());
    //1個class 幫你record 左一堆object
    Book2 book21 = new Book2("John", 19);
    Book2 book22 = new Book2("John", 19);

    System.out.println(book21.name());
    System.out.println(book21.age());
    System.out.println(book21.toString());
    System.out.println(book21.equals(book22));
    System.out.println(book21.hashCode());
    System.out.println(book22.hashCode());
    Book2 book23 = new Book2("Peter", 23);
    System.out.println(book23.hashCode());

    

  }
}
