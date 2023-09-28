public class StringBuilders1 {
  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder();

    s1.append("append");
    s1.append(" the world");
    System.out.println(s1.toString());//append the world

    s1.append(" ").append(" hello").toString();//s1(object) . append(" ") <- object . appne(" hello")


    StringBuilder s2 = new StringBuilder();
    for (int i =0; i <= 10 ; i++) {
      if( i %2 ==1) {
        s2.append(i).append(" ") ;
      }
    }
    System.out.println(s2.toString());
    System.out.println(s1.insert(6," Java"));//append Java the world  hello
    System.out.println(s1.delete(0,2));//pend Java the world  hello
    s1.setCharAt(2, 'X');
    System.out.println(s1.toString());//peXd Java the world  hello
    s1.replace(2, 4, "yz");
    System.out.println(s1.toString());//peyz Java the world  hello
    s1.reverse();
    System.out.println(s1.toString());//olleh  dlrow eht avaJ zyep  


    
  }
}
