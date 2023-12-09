import java.util.function.Consumer;

public class Sysout implements Consumer<String>{
 
  @Override
  public void accept(String s){
    System.out.println(s);
  }
  
}
