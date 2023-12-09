public class DemoOuter{


  public static void main(String[] args) {
    Outer outer = new Outer("ABC");
    Outer.NestedClass statiNestedClass = new Outer.NestedClass("ABC");
    statiNestedClass.display();//

    Company.Employee employee = new Company.Employee("John", 123);// -> static?
    Employee employee2 = new Employee();

    Company.Employee employee3 = Company.creatEmployee("John", 123);

    Outer outer2 = new Outer("DEF");
    Outer.InnerClass inner = outer2.new InnerClass("IJK");
    //use another object to create another object
    //Object (outer2) create  a new object ()
    //左的obejct -> 右object
    inner.disply();//Outer name1=DEF, Inner name3 ="IJK"
    outer2.disply();//Outer name1=DEF

    //Example inner class

    Library library1 = new Library("ABC");//1個地址
    Library.Book b1 = library1.new Book("Book 1");
    Library.Book  b2 = library1.createBook("Book 1");//1個地址

    //因為用object 去call ->library1 is an Object -> use instance method
    //library1.new Book("Book1")
    System.out.println("book 1 infor ="+ b1.info());//book 1 infor =ABCBook 1
    //Library.Book b1 = library1.new Book("Book 1");
    //library1-> "ABC"
    //new Book("Book 1") - > Book 1
  }
}