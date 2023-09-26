public class StringTest {
  public static void main(String[] args) {
    //Approach 1
<<<<<<< HEAD
    String str = "hello" ;// str is a object reference _> String 都係一個class
=======
    String str = "hello" ;// str is ab object reference _> String 都係一個class
>>>>>>> 5fe8aef82f6fb66d78f45468272d689014b6facd
    //"hello" is an String obejct in heap
    //wrapper class 同string 唔使用 "new " 都可以create an object

    String str2 = new String ("hello"); //-> 有"new" keyword -> create an Object in heap
    
    String str3 = str;

    //--> logic find two string variable with the same value of "hello"
    //so it resuse the same object
    String str4 = "hello";
    String str5 = "hello!";
    

    
    System.out.println(str.equals(str2)); //true - > checking the value inside object
    System.out.println(str == str2);//false , 因為"new"起左新object -> 唔係同一, checking if they are the same object

    System.out.println(str == str3); //true str3 -> str -> "hello" object
    System.out.println(str == str4); //true !!!
    System.out.println(str == str5); // false


  }
<<<<<<< HEAD
}
=======
}
>>>>>>> 5fe8aef82f6fb66d78f45468272d689014b6facd
