package box;

public class StringBox implements CharSequence{//Encapsulation,所有野都係封裝, 用家唔使知什麼方法得出結果  
  
  private char [] arr; //Saving "sample"
  //string 由char 組成, 唔可以改arr 入面的野
  //用家唔使識charArray點用 
  //如果要改用其他方法save, 唔用charArray, 用家都唔使知 

  //constructor
  public static StringBox valueOf(String s){//private 左個constructor 後要加
    return new StringBox(s);
    
  } 

  public StringBox(char [] arr) {
    this.arr =arr;
  }

  private StringBox(String s){ 
    this.arr = new char[s.length()];
    for (int i=0; i<s.length();i++) {
      this.arr[i] = s.charAt(i);
    }
  }

  @Override// toString 變做string 出返去, 轉換型態
  public String toString(){
    return String.valueOf(this.arr);
  }
  //append 改寫Old stringBox 入面的野
  //charArray -> String -> append 
  public StringBox append(String s){
    //array size -> 唔夠位 -> 開新array(array is a fixed length)
    //new a new char array
    int pos =0;
    char [] arrays = new char[this.arr.length+s.length()];
    for (int i=0; i< this.arr.length;i++) {
      arrays[i] = this.arr[i];
      pos = i;
    }

    for (int i=0; i<  s.length();i++) {
      arrays[++pos] = s.charAt(i);
    }
    this.arr = arrays; 
    //要改原裝的char Array
    //--> this.arr <- arrays 
    //this.arr (object reference 指住 char[] "sample"), 
    //arrays (object reference 指住 char[] "samplesample")
    //現在可以將this.arr 更改新的地址, 用arrays的 new object 指住新的charArray-> char[] "samplesample" -> 
    return this;// 要改返stringbox 的內容(我要原本的內容  )//NEED CHANGE

    //當無一個object reference 指住一個object, 個object 會自動消失  
  }

  //getter
  @Override
  public int length(){
    return this.arr.length;  
  }
  //getter
  @Override// already implement Charsquence
  public char charAt(int index){
   return this.arr[index];
  } 

  @Override
  public CharSequence subSequence(int start , int end) {//1,4 -> a str of length
    //CharSequence 係一個class implment by StringBox
    //所以= return a StringBox 的object
    if(end == start) {
      return "";
    } else if (end < start) {
      return new StringBox(this.arr); 
      //return 原本array -> return this;但我想return 一個新object -> 唔想俾人desotry
    }
    char [] newArr = new char [end - start] ;
    for (int i= start; i< end ; i++) {
      newArr [i] = this.arr[i];
    }
    return new StringBox(newArr); // 因為寫左個constructor 放array
  }


  
  //use stringbuilder -> can be faster
  //public String subString(int fromIndex, int toIndex){
  public StringBox subString(int fromIndex,int toIndex){
    //String str ="";
    StringBuilder str = new StringBuilder();
    for(int i = fromIndex; i< toIndex; i++) {
      //str += this.arr[i];
      str.append(this.arr[i]);
    }
    //return str.toString();
    //StringBuilder change to string ??
    return new StringBox(str.toString());//**
    // <<唔想影響原本的StringBox -> 就會寫new 1個StringBox-< new Obejct
  }



  public static void main(String[] args) {
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length());//print 6
    System.out.println(stringBox.charAt(2));//print m
    System.out.println(stringBox.subString(1,3).toString());//am-> 
    //find the copy of the stringbox but substring the stringbox -> new a stringbox 
    System.out.println(stringBox.append("sample"));//samplesample
    //想改寫個stringbox -> 要起一個新的char [] (array)

    //System.out.println(StringBox.valueOf("hello world").subString(2, 5).append("!!!").toString());
    //hello world 未save 低- where is hello world , how to save 
    StringBox stringBox2 = StringBox.valueOf("hello world");
    StringBox stringBox3 = stringBox2.subString(2, 4);
    stringBox3.append("!!!!!");
    System.out.println(stringBox3.toString());
    System.out.println(stringBox2.toString());
    //stringbox2 同stringbox3 指住的object 係唔同 
    //how to save substring value (!!!) -> find at append method -> return new 

    //private 的野用public 的方法去爆X佢

    System.out.println("hello".substring(1,1).equals(""));//true
    System.out.println("hello".substring(1,2));//e
    //System.out.println("hello".substring2,1);//error

    //Polymorphism - Interface -> 放哂implmentation class 包括String & StringBox
    CharSequence str = "hello world";// string implment charSequence interface
    str = new StringBox("hello world");// 換左新object
    //str 入面係StringBox -> 
    // . 到什麼係要用什麼X定 -> call what method 係睇type
    //str 現在只可以.CharSequence 的method
    System.out.println(str.length());//11
    System.out.println(str.toString());//hello world

    
    String str2 = "abcd";
    System.out.println(str2.length()); //4
    System.out.println(str2.toString());//abcd
    //new a String "abcd"
    //放String 入String str2
    //所以係睇String str2 係什麼type, .method睇String str2 的String method
  }

}
