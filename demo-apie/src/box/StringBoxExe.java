package box;

public class StringBoxExe {
  private char [] arr;

  public static StringBoxExe valueOf(String s){
    return new StringBoxExe(s);
  }

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
  //create a substring;
  public StringBoxExe subString(int front, int last){
    StringBuilder s = new StringBuilder ();
    for (int i = front ; i< last; i++){
      s.append(this.arr[i]);
    }
    return new StringBoxExe(s.toString());
  }
  //create a toString
  @Override
  public String toString(){
    return String.valueOf(this.arr);
  }

  //create append
  public StringBoxExe append(String s){
    //new a new char array
    int pos = 0;
    char [] arr2 = new char [this.arr.length+s.length()];
    //put old words into new char array
    for (int i =0;i< this.arr.length; i++){
      arr2[i] = this.arr[i];
      pos = i;
    }
    for (int i = 0; i< s.length();i++){
      arr2[++pos] = s.charAt(i);
    }
    this.arr = arr2;
    return this;
  }


  public static void main(String[] args) {
    StringBoxExe stringBoxExe = new StringBoxExe("Exercise");
    System.out.println(stringBoxExe.length());
    System.out.println(stringBoxExe.charAt(2));
    System.out.println(stringBoxExe.subString(2,5).toString());
    System.out.println(stringBoxExe.append("Exercise"));

    //need save 低個字
    StringBoxExe stringBoxExe2 = StringBoxExe.valueOf("hello world");
    StringBoxExe stringBoxExe3 = stringBoxExe2.subString(3,6);
    stringBoxExe3.append("!@!");
    System.out.println(stringBoxExe2.toString());
    System.out.println(stringBoxExe3.toString());
    

  }
}
