public class StringBuilder {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();// new StringBuilder - > constructor
    //人地做好了, 我可以用
    s.append("hello");//stringBuilder is object ref;
    //append () is a method  - > instance method
    s.append("world");
    System.out.println(s.toString());//helloworld

    s.append(" ").append("something").toString();
    System.out.println(s.append(" ").append("something").toString());//helloworld something
    System.out.println(s.toString());//toString 係轉形態, -> //helloworld something
    System.out.println(s.append(" ").append("something").toString());//揾到形態再append -> helloworld something something


    // 1 - 10 , even number, by using StringBuilder
    //result -> "246810"
    int [] nums = new int [] {1,2,3,4,5,6,7,8,9,10};
    StringBuilder s1 = new StringBuilder();
    //String s3 = "";
    for (int i =0; i < nums.length; i ++) {
      if (i % 2 ==0) {
        s1.append(i);//StringBuilder 快過加10倍以上
        //S3 += String.valueOf(i); <- 慢processing 
      }
    }
    System.out.println(s1.toString());//246810
    //StringBuilder ->主要用 append , toString, delete
    //Reverse
  }
}
