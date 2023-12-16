import java.time.LocalDate;

public record Book(String bookName,String authorName ) {

  public static final int NUM = 10;

  public static String bookStore = "ABC";

  public Book {//modify the all-args constructor
    if(this.bookName == null || this.authorName== null){
      throw new IllegalArgumentException();
    }
    
    

  }

  //User declared non-static fields publishDate are not permitted in a record
  //public LocalDate publishDate;
  
  //no no-arg constructor
  //public Book(){
//
  //}

  //final field Book.bookName cannot be assigned
  //因為record 已經keep 左唔可以再改, final
  //setter NOT work, because all attributes all finaled

  //public void setBookName(String bookName){
  //  this.bookName = bookName;
  //}

  public boolean book(){
    return true;
  }

  public int add(int x, int y){
    return x+y;
  }

  public void publish (){
    System.out.println(this.authorName+" "+this.bookName);
  }





}
