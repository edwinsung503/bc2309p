public class ArrayList2 {
  //try to explain why can 無限add to arraylist
  private Integer [] integers;

  public ArrayList2(){
    integers = new Integer[0];
  }
  // it is encaplution< 封裝
  public boolean add(Integer integer){
    //you need to have a new array with length 1
    // 要揾object reference point at old reference??
    
    Integer [] newIntegers = new Integer[this.integers.length +1];
    int i =0;
    //O(n)
    for (Integer old : this.integers) {//loop n times <- Limitation slow -> 成件copy 再搬去第二度
      newIntegers[i++] = old;
    }
    newIntegers[i] = integer;
    this.integers  = newIntegers;// ???? this.object = 新的Integers(old + new)
    return true;
  }

  public Integer [] getIntegers(){
    return this.integers;
  }

  public Integer set(int index, Integer newInteger){
    //return the old element ;
    Integer old = this.integers[index];// 怕個位置消失
    this.integers[index] = newInteger; 
    return old;
  }

  public Integer get(int index) {
    return this.integers[index];
  }
  public int lastIndexOf(Integer integer) {
    for (int i = this.integers.length - 1; i>=0; i--) {
      if (this.integers[i].equals(integer)) {//?? ->use equals() to compare object's value
        return i;
      }
    } 
    return -1;
  }


  public static void main(String[] args) {
    ArrayList2 arrayList2 = new ArrayList2();
    arrayList2.add(10);
    arrayList2.add(1);
    arrayList2.add(100);
    arrayList2.add(-50);
    for (Integer i : arrayList2.getIntegers()) {
      System.out.println(i);
    }
    arrayList2.add(100) ;
    System.out.println(arrayList2.lastIndexOf(100));//4
  }
}
