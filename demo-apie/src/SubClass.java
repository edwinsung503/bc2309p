public class SubClass extends SuperClass{
  int number = 10;
  public static void main(String[] args) {
    SubClass subClass = new SubClass();
    System.out.println(((SuperClass) subClass).number); // 5 upcast from SubClass -> SuperClass

    SuperClass superClass = new SubClass();
    System.out.println(((SubClass) superClass).number); // 10 downcast from SuperClass -> SubClass
  }
}
