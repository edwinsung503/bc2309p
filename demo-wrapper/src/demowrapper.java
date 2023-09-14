public class demowrapper {
  public static void main (String[]args) {
    //Primitives - bytes, short, int, long ,float, double, char, boolean
    //String
    //Wrapper Class -Byte, Short, INteger, Long, Float, Double, Character, Boolean

    //double  <> Double (父子關係)
    //float - > Double (唔得, 無關係)
    //bytes - > Byte (父子關係)
    //byte - > short(升級) - > Short (父子關係)
    short s1 = 10;
    int i1 = s1; // upcast
    Integer i11 = i1; // auto-box
    int i2 = i11; //un-box Integer - > int

    //error, cannot assign short variable to Integer directly
    //Integer i12 = s1 ;

    Integer i12 = (int) s1; // short (cast)- > int(auto-box) -> Integer

    boolean b1 = true;
    Boolean b11 = b1 ; //auto-box

    char c1 = 'u' ;
    Character c11 = c1; //auto-box

    Float f11 = 9.3f;// auto-box, 9.3f is a float value
    Integer i13 = 100; //auto-box, 100 is a int value

    Long l11 = 5L; //auto-box, 5L is a long value
    Double d11 = 5d; //auto-box, 5d is a double value

    //Wrapper Class has null value (default value)
    //Primitives has default value, int - > 0, double -> , boolean - > false, char - > \0000

    //Integer i15 = null;// point to nothing(由有address 變左無address-唔儲任何address)
    //NullPointer - > 無指住任何object
    //become NullPointer after assigning null
    Integer i15 = 4;
    System.out.println(i15); //print 4

    i15 = null;
    System.out.println(i15); //print null

    String s = "hello" ;
    s = null;

    Integer i16 = 8 ;//new Integer(8); <- java 背後幫你call new Integer(8)
    Integer i17 = new Integer(8);//提醒寫法
    System.out.println(i16.compareTo(8));//- > 0
    System.out.println(i16.compareTo(9));//-1, less than 9
    System.out.println(i16.compareTo(7));//1, more than 7
    System.out.println(i16 > 7);//true, 無咁好
    System.out.println(i16.equals(i17)); //< - i16 == i17 - > true
    System.out.println(i16 == 8); //java compare Integer(i16) and int (8), Integer i16 will

    

  }
}