public class DemoOuter{


  public static void main(String[] args) {
    Outer outer = new Outer("ABC");
    Outer.NestedClass statiNestedClass = new Outer.NestedClass("ABC");
    statiNestedClass.display();//

    Company.Employee employee = new Company.Employee("John", 12);
    Employee employee2 = new Employee();

    Outer outer2 = new Outer("DEF");
    Outer.InnerClass inner = outer2.new InnerClass("IJK");
    //左的obejct -> 右object
    inner.disply();//Outer name1=DEF, Inner name3 ="IJK"
    outer2.disply();//Outer name1=DEF

    //Example inner class

    Library library1 = new Library("ABC");//1個地址
    Library.Book  b1 = library1.new Book("Book 1");//1個地址
    System.out.println("book 1 infor ="+ b1.info());
  }
}