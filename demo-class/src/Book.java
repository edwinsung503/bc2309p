public class Book {//A template to describe the objects
  //class 唔一定要來run
  //class 來形容果件事
  int noOfPages;//State
  
  String author;//State

  //instance method -> an instance means an object
  public void setAuthor(String author) {//no static here;
    this.author = author ;//this object- > 依一件物件
  }
  public String getAuthor() {//波問我拎野
    return this.author;//
  }

  public void setNoOfPages(int noOfPages) {
    this.noOfPages = noOfPages ;
  }

  public int getNoOfPages() {
    return this.noOfPages;
  }

  public static String print(){
    return "hello";
  }

  //Static method cannot be associated to the object
  //we use Class name to call static method, i.e. Book.print()
  public static void main(String[] args) {//公用計數機, 誰用都一樣, 似住個class , 得1個公用(工具，唔可以用this)
    Person person1 = new Person();
    person1.setAge(3);

    System.out.println(Book.print());//hello

    
  }
  public String toString (){
    return "author= "+this.author//
     + ", noOfpages= " +this.noOfPages;
  }
}
