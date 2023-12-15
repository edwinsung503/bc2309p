import java.util.List;

public class BookStore {
  
  private String owner;

  private List<String> books;

  public BookStore (String owner, List<String> books){
    this.owner = owner;
    this.books = books;
    
  }

  public List<String> getBooks(){
    return this.books;
  }

  public String getOwner (){
    return this.owner;
  }
}
