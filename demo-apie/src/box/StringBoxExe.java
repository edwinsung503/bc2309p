package box;

public class StringBoxExe {
  private char [] arr;

  // constructor
  public StringBoxExe(String str){
    this.arr = new char [str.length()];
    for (int i=0; i< str.length(); i++){
      this.arr[i] = str.charAt(i);
    }
  }
  //getter
  public int length(){
    return this.arr.length;
  }
  public char charAt(int index){
    return this.arr[index];
  }


  public static void main(String[] args) {
    StringBoxExe stringBoxExe = new StringBoxExe("Exercise");
    System.out.println(stringBoxExe.length());
    System.out.println(stringBoxExe.charAt(2));

  }
}
