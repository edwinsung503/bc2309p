package box;

public class StringBox {
  
  private char [] arr; //string 由char 組成

  //constructor
  public StringBox(String s){
    this.arr = new char[s.length()];
    for (int i=0; i<s.length();i++) {
      this.arr[i] = s.charAt(i);
    }
  }
  //getter
  public int length(){
    return this.arr.length;  
  }
  //getter
  public char charAt(int index){
   return this.arr[index];
  } 

  public static void main(String[] args) {
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length());//print 6
    System.out.println(stringBox.charAt(2));//print m
  }
  


}
