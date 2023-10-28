package box;

public class StringBox {//Encapsulation,所有野都係封裝, 用家唔使知什麼方法得出結果  
  
  private char [] arr; //Saving "sample"
  //string 由char 組成, 唔可以改arr 入面的野
  //用家唔使識charArray點用 
  //如果要改用其他方法save, 唔用charArray, 用家都唔使知 

  //constructor
  public static StringBox valueOf(String s){//private 左個constructor 後要加
    return new StringBox(s);
    
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
  public int length(){
    return this.arr.length;  
  }
  //getter
  public char charAt(int index){
   return this.arr[index];
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
  }

}
