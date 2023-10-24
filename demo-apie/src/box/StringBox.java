package box;

public class StringBox {
  
  private char [] arr; //string 由char 組成

  //constructor
  public StringBox(String s){
    arr = new char[s.length()];
    for (int i=0; i<s.length();i++) {
      arr[i] = s.charAt(i);
    }
  }

  public int length(char [] arr){
    int count = 0;
    for (int i =0; i< arr.length;i++){
      count += i;
    }
    return count;
  }

  public char charAt(char [] arr){
   char word = ' '; 
   for (int i =0; i< arr.length() )
  } 

  public static void main(String[] args) {
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length());//print 6
    System.out.println(stringBox.charAt(2));//print m
  }
  


}
