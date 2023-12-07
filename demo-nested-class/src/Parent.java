public abstract class Parent {
  
  abstract void read();
  //abstract class 唔可以 new
  //以下例外
  public static void main(String[] args) {
    //parenet 未有人extend ,但用一次係OK
    Parent x = new Parent() {
      @Override
      public void read(){
        System.out.println("Hello");
      }
    };
    x.read();//Hello
  }
}
