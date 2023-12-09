public class Library {
  
  public String prefix ;

  public Library (String prefix){
    this.prefix = prefix;
  }
  //return book type 's createBook method
  public Book createBook(String id){
    return new Book(id);
  }
  public class Book{
    private String id;
    public Book (String id) {
      this.id = id;
    }
    public String info(){
      return prefix + this.id;
    }  
  }
}
