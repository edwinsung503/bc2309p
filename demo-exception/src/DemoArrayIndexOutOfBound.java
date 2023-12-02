public class DemoArrayIndexOutOfBound {
  
  public static void main(String[] args) {
    //Exapmle 2
    arrayIndexOutOfBound(new int[10]);
  }
  public static void arrayIndexOutOfBound(int [] arr ) {
    arr[arr.length] = 1;// unchecked exception
    //You should fix the program directly
    //instead of using try catch to handle various scenario
  }
}
