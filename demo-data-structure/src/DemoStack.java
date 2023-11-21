import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
 public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("ABC");;
    queue.add("JPK");

    Stack<String> stack = new Stack<>();
    stack.push("Hello");// return String
    stack.push("World");
    stack.push("!!!!");
    System.out.println(stack.pop());//先入後出,後入先出 //!!!

    stack.add("Test");//add return boolean
    System.out.println(stack.pop());//Test

    String [] arr = {"123","456","789"};
    stack.clear();//clear object value -> from List
    //loop -> insert data into stack
    for (String str: arr) {
      stack.push(str);
    }
    System.out.println(stack.peek());//789 ->先入後出,後入先出
    //loop -> get the data from stack, place into another array
    int index =0;
    String [] result = new String[arr.length] ;
    while (!stack.isEmpty()) {
      result[index ++] = stack.pop();
    }

    System.out.println(Arrays.toString(result));
    



  }
}
