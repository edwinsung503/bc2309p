public class StringConcat{
  
public static void main(String[] args) {
  //Approach 1
  //One line of code
  Concat concat1 = (x1,y1) -> x1 + y1;//<< return 的意思
  //(x1,y1) -> 可以係好多個return type
  Concat concat3 = (x2,y2) -> "Hello";

  //Approach 2
  //if there are more than 1 line of code, we use code block 
  //then we should have "return"
  Concat concat2 = (x,y) -> {
    String str = x + y ;
    return str;
  };
  //how to call ?
  //Excution
  concat1.concat("Hello"," World");
  System.out.println(concat1.concat("Hello"," World"));//Hello World


}
}
